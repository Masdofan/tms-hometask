package com.tms.HT1;

import org.postgresql.Driver;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hometask16", "postgres", "postgres");

        Statement statement = connection.createStatement();

        Statement statement2 = connection.createStatement();


//        statement.execute("create table birthcity (id int primary key, " +
//                "city_name varchar)");
//
//        statement2.execute("create table students (id int primary key, " +
//                "name varchar, " +
//                "age int, " +
//                "birthcity_id int constraint fk_birthcity references birthcity)");
//
//        statement.execute("insert into birthcity (id, city_name) values (1, 'Moscow'), " +
//                "(2, 'Minsk'), " +
//                "(3, 'London')");
//
//        statement.execute("insert into students (id, name, age, birthcity) values (1, 'student1', 24, 3), " +
//                "(2, 'student2', 20, 2), " +
//                "(3, 'student3', 22, 3), " +
//                "(4, 'student4', 21, 1)");

        ResultSet resultSet = statement.executeQuery("select * from students join public.birthcity b on b.id = students.birthcity");

        System.out.println(resultSet.);

        connection.close();



    }

}
