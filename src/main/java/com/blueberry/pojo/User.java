package com.blueberry.pojo;

public class User {
    private Integer id;

    private String fullname;

    private Integer age;

    public User(Integer id, String fullname, Integer age) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}