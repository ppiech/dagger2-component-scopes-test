package net.joesteele.daggercomponentstest;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
  Application app();
  OkHttpClient httpClient();
  @Named("app") String appString();
}
