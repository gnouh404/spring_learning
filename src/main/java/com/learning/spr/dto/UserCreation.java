package com.learning.spr.dto;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCreation {

    @Size(min = 5, message = "Username must be at least 3 characters")
    private String username;

    @Size(min = 8, max = 20, message = "Password must be at least 8 characters and less or equal than 20")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
