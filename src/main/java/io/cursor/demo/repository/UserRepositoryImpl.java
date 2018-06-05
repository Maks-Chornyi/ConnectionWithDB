package io.cursor.demo.repository;

import io.cursor.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private DataSource dataSource;


    @Override
    public List<String> getAllUsers() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from people");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<String> allUsers = new ArrayList<>();

        while(resultSet.next()) {
            allUsers.add(resultSet.getString(1));
        }

        return allUsers;
    }

//    List<User> users = Arrays.asList(
//            new User(1,"Roma","Ruby"),
//            new User(2,"Andrew","Furniture"),
//            new User(3,"Maks","Java")
//            );
//
//
//
//    @Override
//    public List<User> getAllUsers() {
//        return users;
//    }
}
