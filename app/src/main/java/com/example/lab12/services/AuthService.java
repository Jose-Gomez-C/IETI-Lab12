package com.example.lab12.services;

import com.example.lab12.model.LoginWrapper;
import com.example.lab12.model.Token;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {
    @POST("auth")
    Call<Token> login(@Body LoginWrapper lw);
}
