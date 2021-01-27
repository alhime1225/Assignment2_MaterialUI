package com.example.materiaui_assignment2.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

//TODO 1. Create an Entity
/*
    Entity is basically a structure of the database. The tables you might say, it dictates what is going to be
    saved in the database and in what form. Of course, you will need a getter and setter to interact with its members
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    private String name;
    private String phone;
    private String area;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String birthday;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'';
    }
}
