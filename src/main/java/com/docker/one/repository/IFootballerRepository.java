package com.docker.one.repository;

import com.docker.one.controller.requestdto.FootballerRequestDTO;
import com.docker.one.model.Footballer;
import com.docker.one.repository.base.IDataRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ersin on 16.11.2019.
 */
@Repository
public interface IFootballerRepository extends IDataRepository<Footballer, Long> {
}
