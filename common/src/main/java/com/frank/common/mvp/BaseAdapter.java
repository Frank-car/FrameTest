package com.frank.common.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.frank.common.mvp.contract.BaseRefreshContract;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建者 杜阳
 * @创建时间 2020-05-28 16:54
 * @描述  适配器基类
 */
public abstract class BaseAdapter<E, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH>{

    protected Context mContext;
    protected List<E> mList;
    protected OnItemClickListener mOnItemClickListener;
    protected OnItemLongClickListener mOnItemLongClickListener;

    public BaseAdapter(Context context) {
        mContext = context;
        mList = new ArrayList<>();
    }

    public BaseAdapter(Context context, List<E> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int layoutId = onBindLayout();
        View view = LayoutInflater.from(mContext).inflate(layoutId, parent, false);
        return onCreateHolder(view);
    }

    //绑定布局文件
    protected abstract int onBindLayout();

    //创建holder
    protected abstract VH onCreateHolder(View view);

    //绑定数据
    protected abstract void onBindData(VH holder, E e, int position);


    @Override
    public void onBindViewHolder(@NonNull VH holder, final int position) {
        final E data = mList.get(position);
        if (mOnItemClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(data,position);
                }
            });
        }

        if (mOnItemLongClickListener != null){
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    return mOnItemLongClickListener.onItemLongClick(data,position);
                }
            });
        }

        onBindData(holder,data,position);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }


    public void addAll(List<E> list){
        mList.clear();
        if (list != null && list.size() > 0){
            mList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void refresh(List<E> list){
        mList.clear();
        if (list != null && list.size() > 0) {
            mList.addAll(list);
        }
        notifyDataSetChanged();
    }
    public void remove(int positon) {
        mList.remove(positon);
        notifyDataSetChanged();
    }
    public void remove(E e) {
        mList.remove(e);
        notifyDataSetChanged();
    }
    public void add(E e) {
        mList.add(e);
        notifyDataSetChanged();
    }
    public void addLast(E e) {
        add(e);
    }
    public void addFirst(E e) {
        mList.add(0,e);
        notifyDataSetChanged();
    }
    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }
    public List<E> getListData(){
        return mList;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener){
        mOnItemLongClickListener = onItemLongClickListener;
    }



    public interface OnItemClickListener<E>{
        void onItemClick(E e, int position);
    }

    public interface OnItemLongClickListener<E>{
        boolean onItemLongClick(E e, int position);
    }

}
