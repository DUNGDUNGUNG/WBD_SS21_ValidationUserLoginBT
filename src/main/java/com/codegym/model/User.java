package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName, firstName;

    @Min(18)
    private int age;

    @Pattern(regexp = "(^$|[0-9]*$)")
    @Size(min = 10,max = 11)
    private String phoneNumber;


    @Email
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
