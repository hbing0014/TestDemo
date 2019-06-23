package com.example.testdemo.activity;


import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.example.testdemo.R;
import com.example.testdemo.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {
    private SwipeRefreshLayout mRefresh;
    private RecyclerView mRecycle;
    private List<String> list;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mRefresh = findViewById(R.id.swiprefresh);
        mRecycle = findViewById(R.id.recycle);

        mRefresh.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light,
                android.R.color.holo_orange_light, android.R.color.holo_green_light);
        mRefresh.setOnRefreshListener(null);
    }

    @Override
    public void initData() {
        list = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            list.add("条目" + i);
        }
    }

    @Override
    public void initLisner() {

    }
}
