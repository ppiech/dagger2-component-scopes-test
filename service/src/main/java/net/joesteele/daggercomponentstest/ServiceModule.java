package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import android.app.Application;
import android.net.Uri;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides @AppScope @Named("service") String provideServiceString() {
        return "service " + new Random(System.currentTimeMillis()).nextInt();
    }
}
