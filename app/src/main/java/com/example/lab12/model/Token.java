package com.example.lab12.model;

public class Token {

    String accessToken;
    public Token() {

    }
    public Token( String accessToken ) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken( String accessToken ) {
        this.accessToken = accessToken;
    }

}
