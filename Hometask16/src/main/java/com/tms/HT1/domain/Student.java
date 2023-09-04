package com.tms.HT1.domain;

public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Integer cityId;
    private String birthCity;

    public Student(Integer id, String name, Integer age, Integer cityId, String birthCity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cityId = cityId;
        this.birthCity = birthCity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthCity=" + birthCity +
                '}';
    }
}
