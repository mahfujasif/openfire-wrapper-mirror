package com.mlbd.openfire.config;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RestApiClientConfig {

    @Bean
    public RestApiClient restApiClient() {
        return new RestApiClient(
                "192.168.0.216",
                9090,
                new AuthenticationToken("POgv5cRcUdd4E1P7"));
    }
}
