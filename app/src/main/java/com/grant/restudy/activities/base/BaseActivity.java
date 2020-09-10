package com.grant.restudy.activities.base;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    protected Context context;

    public abstract int getLayoutId();

    public abstract void initViews();

    public abstract void initListener();

    public abstract void initData();

    public abstract void OnClick(View v);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initViews();
        initListener();
        initData();

    }

    //View 设置OnClick事件
    public <E extends View> void setOnClick(E view) {
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        OnClick(v);
    }

    public void startEnterActivity(Class clazz) {
        startActivity(new Intent(context, clazz));
    }

    public void startEnterActivity(Class clazz, Bundle bundle) {
        startActivity(new Intent(context, clazz).putExtras(bundle));
    }

    public void startEnterActivityForResult(Class cla, Bundle bundle, int requestCode) {
        startActivityForResult(new Intent(context, cla).putExtras(bundle), requestCode);
    }

    public void startEnterActivityForResult(Class cla, int requestCode) {
        startActivityForResult(new Intent(context, cla), requestCode);
    }
}