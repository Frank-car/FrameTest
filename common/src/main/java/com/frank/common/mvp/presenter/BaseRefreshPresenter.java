package com.frank.common.mvp.presenter;

import android.content.Context;

import com.frank.common.mvp.contract.BaseRefreshContract;
import com.frank.common.mvp.model.BaseModel;
import com.frank.common.mvp.view.BaseRefreshView;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-28 14:07
 * @描述  带有数据刷新的业务层基类
 */
public abstract class BaseRefreshPresenter<M extends BaseModel, V extends BaseRefreshView<T>, T>
        extends BasePresenter<M,V>
        implements BaseRefreshContract.Presenter{

    public BaseRefreshPresenter(Context context, M model, V view) {
        super(context, model, view);
    }
}
