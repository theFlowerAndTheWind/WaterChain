package com.quanminjieshui.watechain.http;

import com.quanminjieshui.watechain.beans.MessageBean;
import com.quanminjieshui.watechain.beans.RegisterResponseBean;
import com.quanminjieshui.watechain.beans.SmsResponseBean;
import com.quanminjieshui.watechain.beans.UserBean;
import com.quanminjieshui.watechain.http.bean.BaseEntity;
import com.quanminjieshui.watechain.http.config.UrlConfig;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
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
    @FormUrlEncoded
    Observable<BaseEntity<UserBean>> login(@Field("name") String name, @Field("password") String password);

    //消息列表
    @GET(UrlConfig.getMessageList)
    Observable<BaseEntity<MessageBean>> getMessageList(@Query("currentPage") String currentPage, @Query("pageSize") String pageSize);  //消息列表

    @POST(UrlConfig.GET_SMS)
    @FormUrlEncoded
    Observable<BaseEntity<SmsResponseBean>> getSms(@Field("mobile") String mobile);

    @POST(UrlConfig.REGISTER)
    @FormUrlEncoded
    Observable<BaseEntity<RegisterResponseBean>> register(@FieldMap Map<String,Object> map);

    @POST(UrlConfig.RESET)
    @FormUrlEncoded
    Observable<BaseEntity<RegisterResponseBean>> reset(@FieldMap Map<String,Object> map);

}
