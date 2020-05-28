package com.frank.common.mvp.view;

import android.content.Context;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-27 18:56
 * @描述  页面基本所需要显示的布局
 */
public interface BaseView extends ILoadView, INoDataView, ITransView, INetErrorView {

    void initView();

    void initListener();

    void initData();

    void finishActivity();

    Context getContext();

}
