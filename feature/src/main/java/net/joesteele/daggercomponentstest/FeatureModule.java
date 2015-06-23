package net.joesteele.daggercomponentstest;

import java.util.Random;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FeatureModule {

    @Provides @AppScope FeatureTest getFeatureTest(@Named("app") String app) {
        return new FeatureTest(app);
    }
}
