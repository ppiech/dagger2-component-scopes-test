package net.joesteele.daggercomponentstest;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@ComponentTestScope
@Component(dependencies = AppComponent.class, modules =  {ComponentTestModule.class})
public interface ComponentTestComponent extends AppComponent {

    @Named("component") Object componentObject();
}
