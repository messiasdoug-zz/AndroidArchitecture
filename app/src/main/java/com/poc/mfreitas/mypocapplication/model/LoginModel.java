package com.poc.mfreitas.mypocapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.poc.mfreitas.mypocapplication.BR;

public class LoginModel extends BaseObservable {
    private String email;
    private String password;

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
