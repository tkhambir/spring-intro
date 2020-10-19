package com.spring.intro.dao;

import com.spring.intro.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
