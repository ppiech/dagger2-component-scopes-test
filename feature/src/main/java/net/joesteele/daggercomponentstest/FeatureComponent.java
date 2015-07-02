package net.joesteele.daggercomponentstest;

// modules = { FeatureModule.class }
public interface FeatureComponent extends AppComponent {
    FeatureTest featureTest();
}
