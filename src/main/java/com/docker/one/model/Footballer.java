package com.docker.one.model;

import com.docker.one.model.base.DataEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by ersin on 16.11.2019.
 */
@Entity
@Table(name = "footballer")
public class Footballer extends DataEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "date_of_place", nullable = false)
    private String dateofPlace;

    @Column(name = "national", nullable = false)
    private String national;

    @Column(name = "worth", nullable = false)
    private int worth;

    public Footballer() {
        super();
    }

    public Footballer(String name, String surname, LocalDate dateOfBirth, String dateofPlace, String national, int worth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateofPlace = dateofPlace;
        this.national = national;
        this.worth = worth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateofPlace='" + dateofPlace + '\'' +
                ", national='" + national + '\'' +
                ", worth=" + worth +
                '}';
    }
}
