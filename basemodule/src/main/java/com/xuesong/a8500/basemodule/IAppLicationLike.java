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

import java.io.File;

public interface IAppLicationLike {


     void onCreate();

     void onTerminate();

     void onLowMemory();

     void onTrimMemory(int level);

     void attachBaseContext(Context base);

     Context getBaseContext();

     AssetManager getAssets();

     Resources getResources();

     PackageManager getPackageManager() ;

     Looper getMainLooper();

     Context getApplicationContext();

     Application getApplication();

     void setTheme(int resid);

     Resources.Theme getTheme();

     ClassLoader getClassLoader();


     String getPackageName();

     ApplicationInfo getApplicationInfo();

     File getDataDir();

     File getFilesDir();

     Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

     Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags);


     Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler);

     Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags);

     void unregisterReceiver(BroadcastReceiver receiver);

     ComponentName startService(Intent service);
}
