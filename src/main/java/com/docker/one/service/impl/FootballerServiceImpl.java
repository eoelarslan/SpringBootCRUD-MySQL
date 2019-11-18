package com.docker.one.service.impl;

import com.docker.one.model.Footballer;
import com.docker.one.repository.IFootballerRepository;
import com.docker.one.service.FootballerService;
import com.docker.one.service.base.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ersin on 16.11.2019.
 */
@Service
@Transactional
public class FootballerServiceImpl extends ServiceImpl<Footballer, Long> implements FootballerService {

    IFootballerRepository footballerRepository;

    public FootballerServiceImpl(IFootballerRepository footballerRepository) {
        super(footballerRepository);
        this.footballerRepository = footballerRepository;
    }

    @Override
    public Footballer save(Footballer footballerList) {
        footballerRepository.save(footballerList);
        return footballerList;
    }

    @Override
    public Footballer findBySurname(String surname) {
        return footballerRepository.findBySurname(surname);
    }

    @Override
    public void deleteById(Long id) {
        footballerRepository.deleteById(id);
    }

    @Override
    public List<Footballer> findAll() {
        return super.findAll();
    }
}
