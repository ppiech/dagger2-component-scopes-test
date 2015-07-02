package net.joesteele.daggercomponentstest;

import javax.inject.Inject;
import javax.inject.Named;

import android.util.Log;

public class FeatureTest {
    String app;

    String service;

    @Inject
    public FeatureTest(@Named("app") String app, @Named("service") String service) {
        this.app = app;
        this.service = service;
    }

    public void onApplicationCreated() {

        Log.d("service", app);
        //Log.d("service", service);
    }
}
