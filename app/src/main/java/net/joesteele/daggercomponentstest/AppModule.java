package net.joesteele.daggercomponentstest;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joesteele on 2/15/15.
 */
@Module
public final class AppModule {
  private final Application app;

  public AppModule(Application app) {
    this.app = app;
  }

  @Provides @AppScope
  Application provideApplication() {
    return app;
  }
}
