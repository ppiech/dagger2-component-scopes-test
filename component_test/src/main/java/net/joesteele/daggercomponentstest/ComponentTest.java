package net.joesteele.daggercomponentstest;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/**
 * Created by joesteele on 2/15/15.
 */
public class ComponentTest extends Application implements AppComponentProvider {
    private ComponentTestComponent component;

    @Override
    public void onCreate() {
        component = DaggerComponentTestComponent.builder()
                .appModule(new AppModule(this))
                .build();

        component.featureTest().onApplicationCreated();
        startService(new Intent().setClass(this, ServiceTest.class));
    }

    public static ComponentTestComponent component(Context context) {
        return app(context).component;
    }

    public static ComponentTest app(Context context) {
        return (ComponentTest) context.getApplicationContext();
    }

    public AppComponent appComponent() {
        return component;
    }

}
