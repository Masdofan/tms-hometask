package com.tms.HT1;

import com.tms.HT1.config.DataBaseConnectionConfig;
import com.tms.HT1.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> getAllStudents() throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from students join public.birthcity b on b.id = students.birthcity");

        return createFromResultSet(resultSet);

    }

    public List<Student> createFromResultSet(ResultSet resultSet) throws SQLException {

        List<Student> studentList = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            int cityId = resultSet.getInt(5);
            String birthCity = resultSet.getString(6);

            Student student = new Student(id, name, age, cityId, birthCity);

            studentList.add(student);

        }

        return studentList;

    }

    public void addStudent(Integer id, String name, Integer age, Integer cityId) throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        var preparedStatement = connection.prepareStatement("insert into students (id, name, age, birthcity) values (?, ?, ?, ?)");

        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, age);
        preparedStatement.setInt(4, cityId);

        preparedStatement.execute();

    }

    public void deleteStudent(String studentName) throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();


        var preparedStatement = connection.prepareStatement("delete from students where name = ?");

        preparedStatement.setString(1, studentName);

        preparedStatement.execute();

    }



}
