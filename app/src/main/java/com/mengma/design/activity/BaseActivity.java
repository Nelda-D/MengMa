package com.mengma.design.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2017/6/22.
 */

public class BaseActivity extends AppCompatActivity {

    protected <V extends View> V $(int id) {
        return (V) findViewById(id);
    }

}
