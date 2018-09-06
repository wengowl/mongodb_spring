package com.k3i.zsgl.mongo;

import com.wengowl.test.Home;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "test.user")
public class User implements Serializable {
    @Id
    private String id;
    private String name;
    private int age;
    private List<String> interest;
    private com.wengowl.test.Home home;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setHome(com.wengowl.test.Home home) {
        this.home = home;
    }

    public Home getHome() {
        return home;
    }
}
