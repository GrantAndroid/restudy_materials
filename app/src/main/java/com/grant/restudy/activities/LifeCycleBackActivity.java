package com.grant.restudy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.grant.restudy.R;
import com.grant.restudy.activities.base.BaseActivity;

import butterknife.BindView;

public class LifeCycleBackActivity extends BaseActivity {

    @BindView(R.id.back_image)
    FrameLayout back_image;
    @BindView(R.id.title_tv)
    TextView title_tv;

    @Override
    public int getLayoutId() {
        return R.layout.activity_life_cycle_back;
    }

    @Override
    public void initViews() {
        title_tv.setText("<-去返回");
    }

    @Override
    public void initListener() {
        back_image.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void OnClick(View v) {
       switch (v.getId()) {
           case R.id.back_image:
               finish();
               break;
       }
    }
}
