package com.mc.custom.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mc.custom.R;

import java.util.List;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class MilletCindeeAdapter extends RecyclerView.Adapter<MilletCindeeAdapter.ViewHolder> {

    Context mContext;
    List<String> mList;

    public MilletCindeeAdapter(Context mContext, List<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recycle_item, parent, false);
        return new MilletCindeeAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.mTextView.setText(mList.get(position));
        // 设置单击事件
        setupItemClickListener(viewHolder, position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_contents);
        }
    }
    /**
     * @param viewHolder
     * @param position
     */
    protected void setupItemClickListener(MilletCindeeAdapter.ViewHolder viewHolder, final int position) {
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(position);
                }
            }
        });
    }
    /**
     * 单击事件
     */
    protected MilletCindeeAdapter.OnItemClickListener mOnItemClickListener;
    /**
     * 设置点击事件
     *
     * @param listener
     */
    public void setOnItemClickListener(MilletCindeeAdapter.OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    /**
     * 点击事件Listener
     */
    public static interface OnItemClickListener {
        void onItemClick(int position);
    }

}
