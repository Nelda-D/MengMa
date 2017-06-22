package com.mengma.design.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.mengma.design.R;

/**
 * Created by Administrator on 2017/6/22.
 */

public class ProductInfoActivity extends BaseActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info_layout);
        initUI();
    }

    private void initUI() {
        ImageView imageview = $(R.id.imgv_cover);
        imageview.setImageResource(R.mipmap.table);
    }

}
