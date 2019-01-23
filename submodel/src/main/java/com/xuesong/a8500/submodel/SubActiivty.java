package com.xuesong.a8500.submodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xuesong.a8500.basemodule.router.RouterPath;
import com.xuesong.a8500.basemodule.router.provider.IUserProvider;

@Route(path = "/sub/SubActiivty")
public class SubActiivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IUserProvider iUserProvider = (IUserProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_USER_SERVICE).navigation();
        if(iUserProvider!=null){
         Log.i("wang","====="+iUserProvider.getUserInfo());
        }
    }
}
