package com.docker.one.service;

import com.docker.one.controller.requestdto.FootballerRequestDTO;
import com.docker.one.model.Footballer;
import com.docker.one.service.base.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ersin on 16.11.2019.
 */

public interface FootballerService extends IService<Footballer, Long> {
    Footballer save(Footballer footballerList);
}
