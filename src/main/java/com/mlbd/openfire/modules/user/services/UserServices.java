package com.mlbd.openfire.modules.user.services;

import com.mlbd.openfire.modules.user.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserServices {

    private final RestApiClient restApiClient;

    public Response create(UserDTO userDTO) {
        log.info("creating user {}", userDTO);
        UserEntity userEntity = new UserEntity(
                userDTO.getUserName(),
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPassword()
        );

        Response response = restApiClient.createUser(userEntity);
        
        log.info("successfully created user {}", response);
        return response;
    }
}
