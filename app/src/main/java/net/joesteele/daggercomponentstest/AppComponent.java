package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import dagger.Component;

@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
  Application app();
  OkHttpClient httpClient();
  @Named("app") String appString();
}
