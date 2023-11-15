package com.example.model;

import java.io.Serializable;

public class Token implements Serializable {
    private String access_token;
    private String token_type;
    private int expires_in;


    public String getAccess_token() {
        return access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }
}
