package com.quanminjieshui.watechain.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.quanminjieshui.watechain.R;
import com.quanminjieshui.watechain.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_go_login)
    Button btn_go_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /**
     * 初始化页面Ui
     */
    @Override
    public void initContentView() {
        setContentView(R.layout.activity_main);
    }



    /**
     * 网络状况改变情况下 重试刷新数据
     *
     * @param viewId
     */
    @Override
    public void onReNetRefreshData(int viewId) {

    }

    @OnClick({R.id.btn_go_login})
    public void OnClick(View view){
        switch (view.getId()) {
            case R.id.btn_go_login:
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                break;
            default:
                break;
        }
    }
}
