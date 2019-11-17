package com.docker.one.controller.responsedto;

/**
 * Created by ersin on 16.11.2019.
 */
public class FootballerResponseDTO {

    private String name;
    private String username;

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

    @Override
    public String toString() {
        return "FootballerResponseDTO{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
