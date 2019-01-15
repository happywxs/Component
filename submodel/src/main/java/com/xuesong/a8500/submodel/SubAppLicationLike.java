package com.xuesong.a8500.submodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.xuesong.a8500.basemodule.AppLicationLikeManager;
import com.xuesong.a8500.basemodule.AppLicationLikePoxy;
import com.xuesong.a8500.basemodule.IAppLilcationLike;

public class SubAppLicationLike extends AppLicationLikePoxy {

    protected SubAppLicationLike(Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IAppLilcationLike iAppLilcationLike= AppLicationLikeManager.getInstance().getAppLicationLike(AppLicationLikeManager.SUB_APPLICATION_LIKE);
        String name=iAppLilcationLike.getResources().getString(R.string.app_name);
        Log.i("wang","==name==="+name);
        Log.i("wang", "===subLike==oncrete");
        Log.i("wang", "===subLike1=="+getResources().getString(R.string.app_name));


    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.i("wang", "===subLike==attach");
    }
}
