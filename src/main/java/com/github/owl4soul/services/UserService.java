package com.github.owl4soul.services;

import com.github.owl4soul.User;
import com.github.owl4soul.dao.UserDao;

import java.util.List;

//Business logic
public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public User findUser(String userName) {
        return usersDao.findByUsername(userName);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }
}
