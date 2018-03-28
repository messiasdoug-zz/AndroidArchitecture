package com.poc.mfreitas.mypocapplication.dagger;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.poc.mfreitas.mypocapplication.view.ui.userprofile.UserProfileViewModel;
import com.poc.mfreitas.mypocapplication.viewmodel.MyPocViewModelFactory;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(UserProfileViewModel.class)
    abstract ViewModel bindUserProfileViewModel(UserProfileViewModel userViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(MyPocViewModelFactory factory);

    @Documented
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey {
        Class<? extends ViewModel> value();
    }
}
