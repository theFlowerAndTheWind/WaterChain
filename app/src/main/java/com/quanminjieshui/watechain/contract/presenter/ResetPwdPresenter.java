/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ResetPwdPresenter
 * Author: sxt
 * Date: 2018/12/9 2:17 AM
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
package com.quanminjieshui.watechain.contract.presenter;

import com.quanminjieshui.watechain.base.BaseActivity;
import com.quanminjieshui.watechain.contract.BasePresenter;
import com.quanminjieshui.watechain.contract.model.ResetPwdModel;
import com.quanminjieshui.watechain.contract.view.ResetPwdViewImpl;

import java.util.Map;

/**
 * @ClassName: ResetPwdPresenter
 * @Description: java类作用描述
 * @Author: sxt
 * @Date: 2018/12/9 2:17 AM
 */
public class ResetPwdPresenter extends BasePresenter<ResetPwdViewImpl>  {

    private ResetPwdModel model;

    public ResetPwdPresenter(ResetPwdModel model) {
        this.model = model;
    }

    public void verify(String mobile) {
        model.verify(mobile);
    }

    public void verify(final String mobile, final String pwd, final String confirm, final String sms) {
        model.verify(mobile, pwd, confirm, sms);
    }

    public void getSms(BaseActivity activity, String mobile) {
        if (model == null) {
            model = new ResetPwdModel();
        }


        model.getSms(activity, mobile, new ResetPwdModel.ResetPwdCallback() {


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
            public void onGetSmsSuccess() {
                if (mView != null) {
                    mView.onGetSmsSuccess();
                }
            }

            @Override
            public void onGetSmsFailed(String msg) {
                if (mView != null) {
                    mView.onGetSmsFailed(msg);
                }
            }

            @Override
            public void onResetSuccess() {
            }

            @Override
            public void onResetFaild(String msg) {
            }

        });
    }

    public void reset(BaseActivity activity, final String mobile, final String pwd, final String confirm, final String sms) {
        if (model == null) {
            model = new ResetPwdModel();
        }
        model.reset(activity, mobile, pwd, confirm, sms, new ResetPwdModel.ResetPwdCallback() {
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
            public void onGetSmsSuccess() {
            }

            @Override
            public void onGetSmsFailed(String msg) {
            }

            @Override
            public void onResetSuccess() {
                if (mView != null) {
                    mView.onResetSuccess();
                }
            }

            @Override
            public void onResetFaild(String msg) {
                if (mView != null) {
                    mView.onResetFaild(msg);
                }
            }
        });
    }
}
