package com.quanminjieshui.watechain.contract.view;

import com.quanminjieshui.watechain.contract.IBaseViewImpl;

import java.util.Map;

public interface ResetPwdViewImpl extends IBaseViewImpl {
    void onEdtContentsLegal();

    void onEdtContentsIllegal(Map<String, Boolean> verify);

    void onGetSmsSuccess();

    void onGetSmsFailed(String msg);

    void onResetSuccess();

    void onResetFaild(String msg);
}

