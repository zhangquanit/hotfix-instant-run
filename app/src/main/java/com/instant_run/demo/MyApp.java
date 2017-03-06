package com.instant_run.demo;

import android.app.Application;
import android.content.Context;

/**
 * @author 张全
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("MyApp onCreate,classLoader="+getClassLoader());
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        System.out.println("MyApp attachBaseContext ,base="+base);
    }
}
