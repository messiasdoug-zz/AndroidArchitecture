package com.poc.mfreitas.mypocapplication.service;

import com.poc.mfreitas.mypocapplication.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("users/{user}")
    Call<User> getUser(@Path("user") String userId);
}
