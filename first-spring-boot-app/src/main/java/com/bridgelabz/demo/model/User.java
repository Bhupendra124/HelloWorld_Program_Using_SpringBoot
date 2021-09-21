package com.bridgelabz.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private  String firstName;
    private  String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
