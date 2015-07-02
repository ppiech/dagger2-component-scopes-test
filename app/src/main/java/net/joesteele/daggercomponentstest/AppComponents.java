package net.joesteele.daggercomponentstest;

import android.content.Context;

public class AppComponents {
    public static  AppComponent appComponent(Context context) {
        return ((AppComponentProvider)(context.getApplicationContext())).appComponent();
    }


    public static  <T> T myAppComponent(Context context) {
        return (T)((AppComponentProvider)(context.getApplicationContext())).appComponent();
    }
}
