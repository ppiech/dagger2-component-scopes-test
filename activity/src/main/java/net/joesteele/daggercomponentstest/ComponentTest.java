package net.joesteele.daggercomponentstest;

import android.app.Application;
import android.content.Context;

/**
 * Created by joesteele on 2/15/15.
 */
public class ComponentTest extends Application {
  private ComponentTestComponent component;

  @Override public void onCreate() {


    component = DaggerComponentTestComponent.builder()
            .appComponent(
                    DaggerAppComponent.builder()
                            .appModule(new AppModule(this))
                            .build())
            .build();
  }

  public static AppComponent component(Context context) {
    return app(context).component;
  }

  public static ComponentTest app(Context context) {
    return (ComponentTest) context.getApplicationContext();
  }
}
