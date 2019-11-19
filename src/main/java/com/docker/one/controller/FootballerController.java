package com.docker.one.controller;

import com.docker.one.controller.base.GenericResponseDTO;
import com.docker.one.controller.requestdto.FootballerRequestDTO;
import com.docker.one.controller.responsedto.FootballerResponseDTO;
import com.docker.one.exception.ResourceNotFoundException;
import com.docker.one.model.Footballer;
import com.docker.one.service.FootballerService;
import com.docker.one.util.enums.MessageStatus;
import com.docker.one.util.helper.MessageHelper;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Created by ersin on 16.11.2019.
 * <p>
 * New Football Player can be added or Existing players can be retrieved
 * updated and deleted.
 */
@Slf4j
@Validated
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

        footballerService.save(footballer);
        modelMapper.map(footballer, footballerResponseDTO);

        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerResponseDTO));
    }

    @GetMapping("/getAllFootballers")
    public ResponseEntity getAllFootballers() {
        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerService.findAll()));
    }

    @GetMapping("/getDetailedFootballer/bySurname/{surname}")
    public ResponseEntity getDetailedFootballerByName(@PathVariable(value = "surname") String surname) {
        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerService.findBySurname(surname)));
    }

    @GetMapping("/getFootballer/bySurname/{surname}")
    public ResponseEntity getFootballerByName(@PathVariable(value = "surname") String surname) {

        modelMapper.map(footballerService.findBySurname(surname), footballerResponseDTO);

        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerResponseDTO));
    }

    @GetMapping("/getDetailedFootballer/byId/{id}")
    public ResponseEntity getDetailedFootballerById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerService.get(id)));
    }

    @GetMapping("/getFootballer/byId/{id}")
    public ResponseEntity getFootballerById(@PathVariable(value = "id") Long id) {

        Optional<Footballer> footballer = Optional.ofNullable(footballerService.get(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id)));

        footballerResponseDTO.setName(footballer.isPresent() ? footballer.get().getName() : null);
        footballerResponseDTO.setSurname(footballer.isPresent() ? footballer.get().getSurname() : null);

        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerResponseDTO));
    }

    @PutMapping("/updateFootballer/{id}")
    public ResponseEntity updateFootballer(@PathVariable(value = "id") Long id,
                                           @Valid @RequestBody FootballerRequestDTO footballerRequestDTO) {

        Optional<Footballer> footballer = Optional.ofNullable(footballerService.get(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id)));

        // TODO rewrite as lambda function
        if (footballer.isPresent()) {
            footballer.get().setWorth(footballerRequestDTO.getWorth());
        }

        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), footballerService.save(footballer.get())));
    }

    @DeleteMapping("/deleteFootballer/{id}")
    public ResponseEntity deleteFootballer(@PathVariable(value = "id") Long id) {

        footballerService.deleteById(id);
        return ResponseEntity.ok().body(new GenericResponseDTO<>(HttpStatus.ACCEPTED,
                messageHelper.getMessageByMessageStatus(MessageStatus.DATA_RETRIEVED, null), null));

    }
}
