package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class ComponentTestModule {
    @Provides @ComponentTestScope
    @Named("component") Object provideComponentObject(Application app) {
        return new Object();
    }
}
