package com.frank.common.mvp.model;

import android.content.Context;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-28 11:49
 * @描述  MVP Model层基类
 */
public class BaseModel {

    private Context mContext;
    private LifecycleProvider lifecycle;

    public BaseModel(Context context) {
        mContext = context;
    }

    // 为当前Model注入生命周期
    public void injectLifecycle(LifecycleProvider lifecycle){
        this.lifecycle = lifecycle;
    }

    public LifecycleProvider getLifecycle() {
        return lifecycle;
    }

    public Context getContext() {
        return mContext;
    }

    // Model层销毁时调用该方法
    public void destory(){
    }

}
