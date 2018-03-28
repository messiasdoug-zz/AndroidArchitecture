package com.poc.mfreitas.mypocapplication.dagger;

import android.app.Application;

import com.poc.mfreitas.mypocapplication.MyPocApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityModule.class
})
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        Builder appModule(AppModule appModule);
        AppComponent build();
    }
    void inject(MyPocApplication githubApp);
}