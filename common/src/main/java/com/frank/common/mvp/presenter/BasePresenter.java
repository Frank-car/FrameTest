package com.frank.common.mvp.presenter;

import android.content.Context;

import com.frank.common.mvp.model.BaseModel;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-28 13:52
 * @描述  业务层基类
 */
public abstract class BasePresenter<M extends BaseModel,V> {

    private Context mContext;
    private M mModel;
    private V mView;

    public BasePresenter(Context context, M model, V view) {
        mContext = context;
        mModel = model;
        mView = view;
    }

    public void detach(){
        detachView();
        detachModel();
    }

    public void detachView(){
        mView = null;
    }

    public void detachModel(){
        mModel.destory();
        mModel = null;
    }

    public void injectLifeCycle(LifecycleProvider lifecycle){

        // 若页面有该页面Model层，则必须将model注入到生命周期中，方便能随时销毁model层任务
        if (mModel != null){
            mModel.injectLifecycle(lifecycle);
        }
    }







}
