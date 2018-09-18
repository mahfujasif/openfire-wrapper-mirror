package com.mlbd.openfire.modules.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private String name;

    private String userName;

    private String password;

    private String email;

}
