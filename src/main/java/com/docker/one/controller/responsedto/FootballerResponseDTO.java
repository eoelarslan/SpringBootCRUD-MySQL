package com.docker.one.controller.responsedto;

/**
 * Created by ersin on 16.11.2019.
 */

import org.springframework.stereotype.Component;

@Component
public class FootballerResponseDTO {

    private String name;
    private String surname;

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

    @Override
    public String toString() {
        return "FootballerResponseDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
