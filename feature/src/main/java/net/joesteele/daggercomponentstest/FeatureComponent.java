package net.joesteele.daggercomponentstest;

import dagger.Subcomponent;

@AppScope
@Subcomponent(modules = FeatureModule.class)
public interface FeatureComponent extends AppComponent {

    FeatureTest featureTest();
}
