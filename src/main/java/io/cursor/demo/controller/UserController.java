package io.cursor.demo.controller;

import io.cursor.demo.model.User;
import io.cursor.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcomePage() {
        return "Hello, Dude";
    }

    //@GetMapping("/students")
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<String> getAllUsers() throws SQLException {
        return userService.getAllUsers();
    }

}
