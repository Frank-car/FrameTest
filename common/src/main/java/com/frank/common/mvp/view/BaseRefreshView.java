package com.frank.common.mvp.view;

import android.media.SoundPool;

import com.frank.common.mvp.contract.BaseRefreshContract;

import java.util.List;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-27 19:21
 * @描述  带有数据刷新的P层
 */
public interface BaseRefreshView<T> extends BaseRefreshContract.View {

    /**
     * 刷新数据
     * @param data
     */
    void refreshData(List<T> data);

    /**
     * 加载更多
     * @param data
     */
    void loadMoreData(List<T> data);

}
