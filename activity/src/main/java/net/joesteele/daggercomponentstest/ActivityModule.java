package net.joesteele.daggercomponentstest;

import android.app.Application;
import android.net.Uri;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.util.Random;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joesteele on 2/15/15.
 */
@Module
public class ActivityModule {
  @Provides @ActivityScope Picasso providePicasso(Application app, OkHttpClient client) {
    return new Picasso.Builder(app)
        .downloader(new OkHttpDownloader(client))
        .listener(new Picasso.Listener() {
          @Override public void onImageLoadFailed(Picasso picasso, Uri uri, Exception e) {
            Log.e("Picasso", "Failed to load image: " + uri.toString(), e);
          }
        })
        .build();
  }

    @Provides @ActivityScope @Named("activity") String provideActivityString() {
        return "activity " + new Random(System.currentTimeMillis()).nextInt();
    }
}
