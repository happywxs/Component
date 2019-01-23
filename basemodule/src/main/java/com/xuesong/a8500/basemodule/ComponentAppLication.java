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
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.io.File;

public class ComponentAppLication extends Application {
    AppLicationLikeManager iAppLilcationLike;

    public ComponentAppLication() {
        super();
        Log.i("wang", "注册 model appLike");
        iAppLilcationLike =AppLicationLikeManager.getInstance();
        iAppLilcationLike.regitLike(AppLicationLikeManager.SUB_APPLICATION_LIKE,this);
        iAppLilcationLike.regitLike(AppLicationLikeManager.MAIN_APPLICATION_LIKE,this);
    }



    @Override
    public void onCreate() {
        iAppLilcationLike.onCreate();
       /* ServiceLoader<IAppLicationLike> serviceLoader=ServiceLoader.load(IAppLicationLike.class,IAppLicationLike.class.getClassLoader());
        Iterator<IAppLicationLike> iterable=serviceLoader.iterator();
        if(iterable.hasNext()){
            iterable.next().onCreate();
        }*/
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        iAppLilcationLike.onTerminate();
        unregitLike();
        super.onTerminate();

    }

    @Override
    public void onLowMemory() {
        iAppLilcationLike.onLowMemory();
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
       iAppLilcationLike.onTerminate();
        super.onTrimMemory(level);
    }

    @Override
    protected void attachBaseContext(Context base) {
        iAppLilcationLike.attachBaseContext(base);
        super.attachBaseContext(base);
    }

    @Override
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override
    public AssetManager getAssets() {
        return super.getAssets();
    }

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    public PackageManager getPackageManager() {
        return super.getPackageManager();
    }

    @Override
    public Looper getMainLooper() {
        return super.getMainLooper();
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }

    @Override
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override
    public ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    @Override
    public String getPackageName() {
        return super.getPackageName();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return super.getApplicationInfo();
    }

    @Override
    public File getDataDir() {
        return super.getDataDir();
    }

    @Override
    public File getFilesDir() {
        return super.getFilesDir();
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags) {
        return super.registerReceiver(receiver, filter, flags);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler, flags);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
    }

    @Override
    public ComponentName startService(Intent service) {
        return super.startService(service);
    }

    private void unregitLike() {
       iAppLilcationLike.unRegitLike();
    }
}
