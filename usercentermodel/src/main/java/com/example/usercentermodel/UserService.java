package com.example.usercentermodel;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xuesong.a8500.basemodule.router.RouterPath;
import com.xuesong.a8500.basemodule.router.bean.IUser;
import com.xuesong.a8500.basemodule.router.provider.IUserProvider;

@Route(path = RouterPath.ROUTER_PATH_USER_SERVICE, name = "用户中心")
public class UserService implements IUserProvider {
    @Override
    public IUser getUserInfo() {
        Log.i("wang", "=======获取 userInfo=======");
        return UserState.getInstance().getiUser();
    }

    @Override
    public void setUserInfo(IUser iUser) {
        UserState.getInstance().setiUser(iUser);
    }

    @Override
    public void init(Context context) {

    }
}
