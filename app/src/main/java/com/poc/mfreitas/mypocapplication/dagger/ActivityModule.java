package com.poc.mfreitas.mypocapplication.dagger;

import com.poc.mfreitas.mypocapplication.view.ui.userprofile.UserProfileActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract UserProfileActivity contributeUserProfileActivity();
}
