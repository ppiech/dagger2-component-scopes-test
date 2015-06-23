package net.joesteele.daggercomponentstest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class ServiceTest extends Service {

    @Inject
    @Named("app")
    String app;

    @Inject
    @Named("service")
    String service;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ServiceComponent component = DaggerServiceComponent.builder()
                .appComponent(((AppProvider) getApplicationContext()).appComponent()).build();

        component.inject(this);

        Log.d("service", app);
        Log.d("service", service);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
