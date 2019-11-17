package com.docker.one.controller;

import com.docker.one.controller.base.GenericResponseDTO;
import com.docker.one.controller.requestdto.FootballerRequestDTO;
import com.docker.one.model.Footballer;
import com.docker.one.service.FootballerService;
import com.docker.one.util.enums.MessageStatus;
import com.docker.one.util.helper.MessageHelper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by ersin on 16.11.2019.
 */
@RestController
@RequestMapping(value = "/")
public class FootballerController {

    @Autowired
    private MessageHelper messageHelper;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FootballerService footballerService;


    @PostMapping("/saveFootballer")
    public ResponseEntity saveFootballer(@Valid @RequestBody Footballer footballer) {
        return ResponseEntity.ok().body(footballerService.save(footballer));
    }
}
