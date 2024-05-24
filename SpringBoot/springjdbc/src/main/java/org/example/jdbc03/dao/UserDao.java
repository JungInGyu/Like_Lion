package org.example.jdbc02.dao;

import java.util.List;

public interface UserDao {
    void insertUser(User user);
    List<User> findAllUsers();
    void updateUserEamil(String name, String email);
    void deleteUser(String name);
}
