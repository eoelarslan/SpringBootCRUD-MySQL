package com.docker.one.service.base;

import com.docker.one.model.base.DataEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IService<T extends DataEntity, ID extends Serializable> {

    public T save(T entity);

    public List<T> findAll();

    public Optional<T> get(ID id);

    public void remove(ID id);
}
