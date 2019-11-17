package com.docker.one.controller.requestdto;

import com.docker.one.model.base.DataEntity;

import java.time.LocalDate;

/**
 * Created by ersin on 16.11.2019.
 */
public class FootballerRequestDTO extends DataEntity {

    private String name;
    private String username;
    private LocalDate dateOfBirth;
    private String dateofPlace;
    private String national;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateofPlace() {
        return dateofPlace;
    }

    public void setDateofPlace(String dateofPlace) {
        this.dateofPlace = dateofPlace;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FootballerRequestDTO{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateofPlace='" + dateofPlace + '\'' +
                ", national='" + national + '\'' +
                ", value=" + value +
                '}';
    }
}
