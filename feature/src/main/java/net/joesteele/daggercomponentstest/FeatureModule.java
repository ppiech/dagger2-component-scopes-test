package net.joesteele.daggercomponentstest;

import java.util.Random;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FeatureModule {

    @Provides @AppScope FeatureTest getFeatureTest(@Named("app") String app, @Named("service") String service) {
        return new FeatureTest(app, service);
    }
}
