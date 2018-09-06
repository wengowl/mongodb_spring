package com.k3i.zsgl.spring.service;

import com.alibaba.fastjson.JSONObject;
import com.k3i.zsgl.mongo.User;
import com.k3i.zsgl.mongo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("mongoTemplate")
    MongoTemplate mongoTemplate;
    @Override
    public List<User> FindAll() {
        JSONObject jsonObject = new JSONObject();

        List<User> userList = new ArrayList<>();
        userList = mongoTemplate.findAll(User.class);


        return userList;
    }
}
