package com.docker.one.service.base;


import com.docker.one.model.base.DataEntity;
import com.docker.one.repository.base.IDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class ServiceImpl<T extends DataEntity, ID extends Serializable> implements IService<T, ID> {

    @Autowired
    private IDataRepository<T, ID> dataRepository;

    public ServiceImpl(IDataRepository<T, ID> dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public T save(T entity) {
        return dataRepository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) dataRepository.findAll();
    }

    @Override
    public Optional<T> get(ID id) {
        return dataRepository.findById(id);
    }

    @Override
    public void remove(ID id) {
        dataRepository.deleteById(id);
    }
}
