package com.frank.common.mvp.view;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-27 19:11
 * @描述  用户交互时显示的View
 */
public interface ITransView {

    /**
     * 加载透明小菊花
     */
    void showTransLoadingView();

    /**
     * 隐藏透明小菊花
     */
    void hideTransLoadingView();

}
