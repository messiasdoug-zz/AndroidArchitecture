package com.poc.mfreitas.mypocapplication.dagger;

import com.poc.mfreitas.mypocapplication.service.UserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ViewModelModule.class)
class AppModule {

    @Singleton
    @Provides
    UserService provideUserService() {
        String URL = "https://jsonplaceholder.typicode.com/";
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UserService.class);
    }
}