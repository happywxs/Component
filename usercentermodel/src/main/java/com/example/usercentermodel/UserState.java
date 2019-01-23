package com.example.usercentermodel;

import com.xuesong.a8500.basemodule.router.bean.IUser;

public class UserState {
    private static UserState userState;
    private IUser iUser;
    public static UserState getInstance() {
        if (userState == null) {
            userState = new UserState();
        }
        return userState;
    }

    public IUser getiUser() {
        return iUser;
    }

    public void setiUser(IUser iUser) {
        this.iUser = iUser;
    }
}
