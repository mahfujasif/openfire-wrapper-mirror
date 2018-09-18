package com.mlbd.openfire.modules.messages.controller;

import com.mlbd.openfire.modules.user.UserDTO;
import com.mlbd.openfire.modules.user.services.UserServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.igniterealtime.restclient.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;


@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserControllers {

    private final UserServices userServices;

    @RequestMapping(path = "v1/users", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody @Validated UserDTO userDTO) {
        log.info("creating user {}", userDTO);
        userServices.create(userDTO);
        //log.info("created user {}", userResponse);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
}
