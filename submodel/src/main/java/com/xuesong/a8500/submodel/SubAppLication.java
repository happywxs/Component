package com.xuesong.a8500.submodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.xuesong.a8500.basemodule.AppLicationLikeManager;

public class SubAppLication extends Application {
    private AppLicationLikeManager appLicationLikeManager;

    protected SubAppLication() {
        Log.i("wang", "===subApplication==");
        appLicationLikeManager = AppLicationLikeManager.getInstance();
        appLicationLikeManager.regitLike(AppLicationLikeManager.SUB_APPLICATION_LIKE,this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        appLicationLikeManager.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appLicationLikeManager.onCreate();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        appLicationLikeManager.onTrimMemory(level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        appLicationLikeManager.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        appLicationLikeManager.onTerminate();
    }
}
