package com.tms.HT1;

import com.tms.HT1.config.DataBaseConnectionConfig;
import com.tms.HT1.domain.City;
import com.tms.HT1.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityService {

    public List<City> getAllCitys() throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from birthcity");

        return createFromResultSet(resultSet);

    }

    public List<City> createFromResultSet(ResultSet resultSet) throws SQLException {

        List<City> cityList = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);

            City city = new City(id, name);

            cityList.add(city);

        }

        return cityList;

    }


    public void addCity(Integer id, String cityName) throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        var preparedStatement = connection.prepareStatement("insert into birthcity (id, city_name) values (?, ?)");

        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, cityName);

        preparedStatement.execute();

    }

    public void deleteCity(String cityName) throws SQLException {

        Connection connection = DataBaseConnectionConfig.getConnection();

        var preparedStatementForRS = connection.prepareStatement("select name from students join public.birthcity b on b.id = students.birthcity where city_name = ?");

        preparedStatementForRS.setString(1, cityName);

        ResultSet resultSet = preparedStatementForRS.executeQuery();

                while(resultSet.next()) {
                    String name = resultSet.getString(1);
                    var preparedStatementForSetNull = connection.prepareStatement("update students set birthcity = null where name = ?");
                    preparedStatementForSetNull.setString(1, name);
                    preparedStatementForSetNull.executeUpdate();
                }



        var preparedStatementForDelete = connection.prepareStatement("delete from birthcity where city_name = ?");

                preparedStatementForDelete.setString(1, cityName);
                preparedStatementForDelete.execute();

    }

}
