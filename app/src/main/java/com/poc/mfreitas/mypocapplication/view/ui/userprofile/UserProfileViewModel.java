package com.poc.mfreitas.mypocapplication.view.ui.userprofile;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.poc.mfreitas.mypocapplication.model.User;
import com.poc.mfreitas.mypocapplication.repository.UserRepository;

import javax.inject.Inject;

public class UserProfileViewModel extends ViewModel {

    private LiveData<User> user;
    private final UserRepository repository;

    @SuppressWarnings("unchecked")
    @Inject
    public UserProfileViewModel(UserRepository repository) {
        this.repository = repository;
    }

    public void init(String userId) {
        if (this.user != null) {
            return;
        }
        user = repository.getUser(userId);
    }

    public LiveData<User> getUser() {
        return this.user;
    }
}