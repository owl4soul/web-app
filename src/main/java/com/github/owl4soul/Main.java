package com.github.owl4soul;

import com.github.owl4soul.services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User.Builder()._userName("newuser")._firstName("Owl")._lastName("Soul")._phone(4444).build();
        userService.saveUser(user);
        userService.updateUser(user);
    }
}
