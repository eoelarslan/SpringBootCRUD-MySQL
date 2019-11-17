package com.docker.one.controller;

import com.docker.one.controller.base.GenericResponseDTO;
import com.docker.one.controller.responsedto.FootballerResponseDTO;
import com.docker.one.model.Footballer;
import com.docker.one.service.FootballerService;
import com.docker.one.util.enums.MessageStatus;
import com.docker.one.util.helper.MessageHelper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by ersin on 16.11.2019.
 *
 * New Football Player can be added or Existing players can be retrieved
 * updated and deleted.
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

    @Autowired
    private FootballerResponseDTO footballerResponseDTO;


    @PostMapping("/saveFootballer")
    public ResponseEntity saveFootballer(@Valid @RequestBody Footballer footballer) {

        //return ResponseEntity.ok().body(footballerService.save(footballer));


        footballerService.save(footballer);

        modelMapper.map(footballer, footballerResponseDTO);

        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerResponseDTO));
    }

    @GetMapping("/getAllFootballers")
    public ResponseEntity getAllFootballers(){
        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerService.findAll()));
    }
}
