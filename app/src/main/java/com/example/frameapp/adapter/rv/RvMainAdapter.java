package com.example.frameapp.adapter.rv;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.frameapp.R;

import java.util.List;

/**
 * MainActivity recyclerView
 * 2020-02-12
 *
 * @author
 */
public class RvMainAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId The layout resource id of each item.
     * @param data        A new list is created out of this one to avoid mutable list
     */
    public RvMainAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    /**
     * Implement this method and use the helper to adapt the view to the given item.
     *
     * @param helper A fully initialized helper.
     * @param item   The item that needs to be displayed.
     */
    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.item_bu_main, item).addOnClickListener(R.id.item_bu_main);
    }
}
