package com.quanminjieshui.watechain.http;

import com.quanminjieshui.watechain.beans.MessageBean;
import com.quanminjieshui.watechain.beans.UserBean;
import com.quanminjieshui.watechain.http.bean.BaseEntity;
import com.quanminjieshui.watechain.http.config.UrlConfig;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by WanghongHe on 2018/12/3 11:41.
 * post和gest
 */

public interface APIService {

    //登录接口
    @POST(UrlConfig.login)
    Observable<BaseEntity<UserBean>> login(@Query("name") String name, @Query("password") String password);

    //消息列表
    @GET(UrlConfig.getMessageList)
    Observable<BaseEntity<MessageBean>> getMessageList(@Query("currentPage") String currentPage, @Query("pageSize") String pageSize);  //消息列表
}
