package com.example.testdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.testdemo.R;
import com.example.testdemo.utils.MySqliterHelper;
import com.jaeger.library.StatusBarUtil;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        MySqliterHelper helper = new MySqliterHelper(this);
        helper.getReadableDatabase();

        setStatus();
        initView();
        initData();
        initLisner();
    }


    protected abstract int getLayout();

    public void initView() {
    }

    public void initData() {
    }

    public void initLisner() {
    }

    public void setStatus() {
        StatusBarUtil.setColor(this, getResources().getColor(R.color.statusbar), 0);
    }
}
