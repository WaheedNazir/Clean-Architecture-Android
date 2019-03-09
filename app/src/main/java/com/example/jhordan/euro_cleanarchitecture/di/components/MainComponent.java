package com.example.jhordan.euro_cleanarchitecture.di.components;

import android.app.Application;

import com.example.jhordan.euro_cleanarchitecture.EuroApplication;
import com.example.jhordan.euro_cleanarchitecture.di.modules.ActivityModule;
import com.example.jhordan.euro_cleanarchitecture.di.modules.AppModule;
import com.example.jhordan.euro_cleanarchitecture.di.modules.FragmentModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Waheed
 */

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, FragmentModule.class, ActivityModule.class})
public interface MainComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        MainComponent build();
    }

    void inject(EuroApplication app);

}
