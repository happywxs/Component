package com.xuesong.a8500.basemodule;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class AppLicationLikeManager {

    public static final String SUB_APPLICATION_LIKE = "com.xuesong.a8500.submodel.SubAppLicationLike";
    public static final String MAIN_APPLICATION_LIKE = "com.xuesong.a8500.basemodule.MainAppLicationLike";
    HashMap<String, IAppLilcationLike> mlikeAppLike = new HashMap();
    public static AppLicationLikeManager appLicationLikeManager = null;

    private AppLicationLikeManager() {

    }

    public static AppLicationLikeManager getInstance() {

        if (appLicationLikeManager == null) {
            appLicationLikeManager = new AppLicationLikeManager();
        }
        return appLicationLikeManager;
    }

    public void regitLike(String packageName,Application context) {
        try {
            Class<?> cls = Class.forName(packageName);
            Constructor con = cls.getDeclaredConstructor(Application.class);
            con.setAccessible(true);
            IAppLilcationLike iAppLilcationLike = (IAppLilcationLike) con.newInstance(context);
            regitLike(packageName, iAppLilcationLike);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void regitLike(String name, IAppLilcationLike iAppLilcationLike) {
        mlikeAppLike.put(name, iAppLilcationLike);
    }

    public void unRegitLike(IAppLilcationLike iAppLilcationLike) {
        mlikeAppLike.remove(iAppLilcationLike);
    }

    public void unRegitLike() {
        mlikeAppLike.clear();
    }

    public IAppLilcationLike getAppLicationLike(String name) {
        return mlikeAppLike.get(name);
    }


    public void attachBaseContext(Context base) {
        for (HashMap.Entry<String, IAppLilcationLike> appLilcationLikeEntry : mlikeAppLike.entrySet())
            appLilcationLikeEntry.getValue().attachBaseContext(base);

    }


    public void onCreate() {
        Log.i("wang", "====appProxy===" + mlikeAppLike.size());
        for (HashMap.Entry<String, IAppLilcationLike> appLilcationLikeEntry : mlikeAppLike.entrySet())
            appLilcationLikeEntry.getValue().onCreate();
    }


    public void onTerminate() {
        for (HashMap.Entry<String, IAppLilcationLike> appLilcationLikeEntry : mlikeAppLike.entrySet())
            appLilcationLikeEntry.getValue().onTerminate();
    }


    public void onLowMemory() {
        for (HashMap.Entry<String, IAppLilcationLike> appLilcationLikeEntry : mlikeAppLike.entrySet())
            appLilcationLikeEntry.getValue().onLowMemory();
    }


    public void onTrimMemory(int level) {
        for (HashMap.Entry<String, IAppLilcationLike> appLilcationLikeEntry : mlikeAppLike.entrySet())
            appLilcationLikeEntry.getValue().onTrimMemory(level);
    }


}
