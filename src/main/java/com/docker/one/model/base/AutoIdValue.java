package com.docker.one.model.base;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AutoIdValue {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected Long id;

    public Long getId() {
        return id;
    }

}
