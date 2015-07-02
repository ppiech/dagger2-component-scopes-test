package net.joesteele.daggercomponentstest;

import android.app.Service;

import javax.inject.Named;

import dagger.Component;

@AppScope
@Component(
        modules =  {
            AppModule.class,
            NetworkModule.class,
            ComponentTestModule.class,
            ServiceModule.class,
            FeatureModule.class
        }
)
public interface ComponentTestComponent extends AppComponent, ServiceComponent, FeatureComponent {
    @Named("component") Object componentObject();
}
