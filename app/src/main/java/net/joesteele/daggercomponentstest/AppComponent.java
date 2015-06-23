package net.joesteele.daggercomponentstest;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
  Application app();
  OkHttpClient httpClient();
}
