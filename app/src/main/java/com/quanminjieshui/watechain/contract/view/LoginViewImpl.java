package com.quanminjieshui.watechain.contract.view;

import com.quanminjieshui.watechain.contract.IBaseViewImpl;

/**
 * Created by WanghongHe on 2018/12/3 11:05.
 * 回调ui的接口函数
 */

public interface LoginViewImpl extends IBaseViewImpl{
    void onLoginSuccess();
    void onLoginFailed(String msg);
}
