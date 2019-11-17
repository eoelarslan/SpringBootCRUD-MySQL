package com.docker.one.service;

import com.docker.one.model.Footballer;
import com.docker.one.service.base.IService;
/**
 * Created by ersin on 16.11.2019.
 */

public interface FootballerService extends IService<Footballer, Long> {
    Footballer save(Footballer footballer);
}
