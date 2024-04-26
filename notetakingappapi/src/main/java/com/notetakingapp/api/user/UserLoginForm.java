package com.notetakingapp.api.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserLoginForm {

    private String username;
    private String password;

}
