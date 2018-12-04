package com.quanminjieshui.watechain.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.quanminjieshui.watechain.R;
import com.quanminjieshui.watechain.base.BaseActivity;
import com.quanminjieshui.watechain.contract.model.LoginModel;
import com.quanminjieshui.watechain.contract.presenter.LoginPresenter;
import com.quanminjieshui.watechain.contract.view.LoginViewImpl;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by WanghongHe on 2018/12/3 11:53.
 */

public class LoginActivity extends BaseActivity implements LoginViewImpl{

    @BindView(R.id.btn_login)
    Button btn_login;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loginPresenter = new LoginPresenter(new LoginModel());
        loginPresenter.attachView(this);


    }

    @OnClick({R.id.btn_login})
    public void OnClick(View view){
        switch (view.getId()) {
            case R.id.btn_login:
                loginPresenter.login(this,"Nigggg","aaaaaaaa");
                break;
            default:
                break;
        }
    }

    /**
     * 初始化页面Ui
     */
    @Override
    public void initContentView() {
        setContentView(R.layout.activity_login);
    }

    /**
     * 网络状况改变情况下 重试刷新数据
     *
     * @param viewId
     */
    @Override
    public void onReNetRefreshData(int viewId) {

    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFailed(String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(loginPresenter!=null){
            loginPresenter.detachView();
        }
    }


}
