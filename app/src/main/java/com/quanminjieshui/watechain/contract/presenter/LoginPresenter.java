package com.quanminjieshui.watechain.contract.presenter;

import android.text.TextUtils;

import com.quanminjieshui.watechain.base.BaseActivity;
import com.quanminjieshui.watechain.contract.BasePresenter;
import com.quanminjieshui.watechain.contract.model.LoginModel;
import com.quanminjieshui.watechain.contract.view.LoginViewImpl;
import com.quanminjieshui.watechain.utils.AccountValidatorUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WanghongHe on 2018/12/3 11:04.
 */

public class LoginPresenter extends BasePresenter<LoginViewImpl> {
    private LoginModel loginModel;

    public LoginPresenter(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public void verify(String mobile, String pwd) {
        loginModel.verify(mobile, pwd);
    }

    public void login(BaseActivity activity, String name, String password) {
        if (loginModel == null) {
            loginModel = new LoginModel();
        }


        loginModel.login(activity, name, password, new LoginModel.LoginCallback() {


            @Override
            public void onEdtContentsLegal() {
                if (mView != null) {
                    mView.onEdtContentsLegal();
                }
            }

            @Override
            public void onEdtContentsIllegal(Map<String, Boolean> verify) {
                if (mView != null) {
                    mView.onEdtContentsIllegal(verify);
                }
            }

            @Override
            public void loginSuccess() {
                if (mView != null) {
                    mView.onLoginSuccess();
                }
            }

            @Override
            public void loginFailed(String msg) {
                if (mView != null) {
                    mView.onLoginFailed(msg);
                }
            }
        });
    }
}
