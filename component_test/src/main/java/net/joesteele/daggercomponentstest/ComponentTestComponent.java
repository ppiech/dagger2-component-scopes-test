package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import dagger.Component;

@ComponentTestScope
@Component(dependencies = { AppComponent.class }, modules =  {ComponentTestModule.class})
public interface ComponentTestComponent extends AppComponent {

    @Named("component") Object componentObject();

    @ComponentTestScope
    ServiceComponent serviceComponent();

    @ComponentTestScope
    FeatureComponent featureComponent();
}
