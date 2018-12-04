package com.quanminjieshui.watechain;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

import com.quanminjieshui.watechain.utils.NetworkStateReceiver;

/**
 * Created by WanghongHe on 2018/12/3 11:26.
 */

public class WateChainApplication extends Application {

    public final static String TAG = "AiotApplication";
    private static WateChainApplication application;
    private NetworkStateReceiver networkStateReceiver;

    public static WateChainApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        //初始化网络receiver
        registerReceiver();
    }

    private void registerReceiver() {
        networkStateReceiver = new NetworkStateReceiver();
        //创建意图过滤器
        IntentFilter filter = new IntentFilter();
        //添加动作，监听网络
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkStateReceiver, filter);
    }

}
