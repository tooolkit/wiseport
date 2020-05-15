package com.yang.service.user;

import com.yang.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public List<User> list() {
        User u = new User();
        u.setName("name1");
        u.setEmail("email1");

        List<User> list = new ArrayList<>();
        list.add(u);
        return list;
    }
}
