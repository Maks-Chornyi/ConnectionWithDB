package io.cursor.demo.service;

import io.cursor.demo.model.User;
import io.cursor.demo.repository.UserRepository;
import io.cursor.demo.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    //UserRepository userRepository;
    UserRepositoryImpl userRepository;

    public List<String> getAllUsers() throws SQLException {
        return userRepository.getAllUsers();
    }
}
