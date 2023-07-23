package main.java.com.example.htlm3.entity;

public class Staff {
    //id name 负责的项目：project 年龄：age
    public int id;
    public  String name;
    public  String project;
    public int age;

    public Staff() {
    }

    public Staff(int id, String name, String project, int age) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
