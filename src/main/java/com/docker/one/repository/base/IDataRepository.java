package com.docker.one.repository.base;


import com.docker.one.model.base.DataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface IDataRepository<T extends DataEntity, ID extends Serializable> extends CrudRepository<T, ID> {
}
