package com.wengowl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDao extends MongoTemplate {
    @Autowired
    private MongoTemplate mongoTemplate;
    public UserDao(MongoDbFactory mongoDbFactory) {
        super(mongoDbFactory);
    }

    public List<User> findAll(){
        return mongoTemplate.findAll(User.class);
    }

}
