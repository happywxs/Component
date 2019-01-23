package com.xuesong.a8500.basemodule.router.provider;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.xuesong.a8500.basemodule.router.bean.IUser;

public interface IUserProvider extends IProvider {
    /**
     * user 提供
     *
     * @return
     */
    IUser getUserInfo();

    /**
     * user注入
     *
     * @param iUser
     */
    void setUserInfo(IUser iUser);

}
