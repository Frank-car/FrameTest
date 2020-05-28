package com.frank.common.mvp.view;

import android.view.View;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-27 19:08
 * @描述  无数据时显示的View
 */
public interface INoDataView {

    /**
     *  无数据时显示的view
     */
    void showNoDataView();

    /**
     * 隐藏无数据View
     */
    void hiddenNoDataView();

    /**
     * 显示特定无数据View
     * @param view
     */
    void showNoDataView(View view);

}
