package io.cursor.demo.repository;

import io.cursor.demo.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {
    List<String> getAllUsers() throws SQLException;
}
