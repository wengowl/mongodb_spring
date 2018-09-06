package com.k3i.zsgl.spring.service;

import com.k3i.zsgl.mongo.TimeaxisNode;
import com.k3i.zsgl.mongo.TimeaxisNodeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
public class TimeaxisNodeServiceImpl implements TimeaxisNodeService {
    @Autowired
    @Qualifier("mongoTemplate")
    MongoTemplate mongoTemplate;
    @Override
    public List<TimeaxisNode> findAll() {
        return mongoTemplate.findAll(TimeaxisNode.class);
    }

    @Override
    public String insert(TimeaxisNode node) {
        mongoTemplate.insert(node);
        return node.getId();


    }

    @Override
    public void update(TimeaxisNode node) {
        Query query = new Query();
        Criteria criteria = where("_id").is(new ObjectId(node.getId()));
//        Criteria criteria = where("id").is(node.getId());
        query.addCriteria(criteria);
        Update update = new Update();
        update.set("title",node.getTitle());
        update.set("time",node.getTime());
        update.set("author",node.getAuthor());
        update.set("url",node.getUrl());
        update.set("summary",node.getSummary());
        update.set("journal",node.getJournal());

        mongoTemplate.updateMulti(query,update,TimeaxisNode.class);



    }
}
