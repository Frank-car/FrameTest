package com.frank.common.mvp.view;

import android.view.View;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-27 19:14
 * @描述 网络出错时，显示的View
 */
public interface INetErrorView {

    /**
     * 显示网络出错时View
     */
    void showNetWorkErrorView();

    /**
     * 隐藏网络出错时View
     */
    void hideNetWorkErrorView();

    /**
     * 显示特定网络出错时View
     * @param view
     */
    void showNetWorkErrorView(View view);

}
