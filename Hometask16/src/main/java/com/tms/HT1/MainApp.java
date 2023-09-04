package com.tms.HT1;

import com.tms.HT1.config.DataBaseConnectionConfig;
import com.tms.HT1.domain.City;
import com.tms.HT1.domain.Student;

import java.sql.*;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        Statement statement = connection.createStatement();

        Statement statement2 = connection.createStatement();


        statement.execute("create table birthcity (id int primary key, " +
                "city_name varchar)");

        statement2.execute("create table students (id int primary key, " +
                "name varchar, " +
                "age int, " +
                "birthcity int constraint fk_birthcity references birthcity)");

        statement.execute("insert into birthcity (id, city_name) values (1, 'Moscow'), " +
                "(2, 'Minsk'), " +
                "(3, 'London')");

        statement.execute("insert into students (id, name, age, birthcity) values (1, 'student1', 24, 3), " +
                "(2, 'student2', 20, 2), " +
                "(3, 'student3', 22, 3), " +
                "(4, 'student4', 21, 1)");

        StudentService studentService = new StudentService();

        CityService cityService = new CityService();

        List<Student> allStudents1 = studentService.getAllStudents();

        System.out.println(allStudents1);

        studentService.addStudent(5, "student5", 19, 1);

        System.out.println("===================");

        List<Student> allStudents2 = studentService.getAllStudents();

        System.out.println(allStudents2);

        System.out.println("===================");

        studentService.deleteStudent("student3");

        List<Student> allStudents3 = studentService.getAllStudents();

        System.out.println(allStudents3);

        System.out.println("===================");

        cityService.addCity(4, "Voronezh");

        List<City> allCitys1 = cityService.getAllCitys();

        System.out.println(allCitys1);

        System.out.println("===================");

        cityService.deleteCity("Moscow");

        List<City> allCitys2 = cityService.getAllCitys();

        System.out.println(allCitys2);

        connection.close();



    }

}
