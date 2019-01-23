package com.xuesong.a8500.basemodule;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

import java.io.File;

public class AppLicationLikePoxy implements IAppLicationLike {
    private Application application;

    protected AppLicationLikePoxy(Application application) {
        this.application = application;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }

    @Override
    public void attachBaseContext(Context base) {

    }

    @Override
    public Context getBaseContext() {
        return application.getBaseContext();
    }

    @Override
    public AssetManager getAssets() {
        return application.getAssets();
    }

    @Override
    public Resources getResources() {
        return application.getResources();
    }

    @Override
    public PackageManager getPackageManager() {
        return application.getPackageManager();
    }

    @Override
    public Looper getMainLooper() {
        return application.getMainLooper();
    }

    @Override
    public Context getApplicationContext() {
        return application.getApplicationContext();
    }

    @Override
    public Application getApplication() {
        return application;
    }

    @Override
    public void setTheme(int resid) {
        application.setTheme(resid);
    }

    @Override
    public Resources.Theme getTheme() {
        return application.getTheme();
    }

    @Override
    public ClassLoader getClassLoader() {
        return application.getClassLoader();
    }

    @Override
    public String getPackageName() {
        return application.getPackageName();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return application.getApplicationInfo();
    }

    @Override
    public File getDataDir() {
        if (Build.VERSION.SDK_INT >= 24) {
            return application.getDataDir();
        } else {
            return null;
        }
    }

    @Override
    public File getFilesDir() {
        return application.getFilesDir();
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return application.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags) {
        return null;
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) {
        return null;
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags) {
        return null;
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        application.unregisterReceiver(receiver);
    }

    @Override
    public ComponentName startService(Intent service) {
        return application.startService(service);
    }

}
