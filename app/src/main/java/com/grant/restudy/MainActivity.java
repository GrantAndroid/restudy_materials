package com.grant.restudy;

import android.view.View;
import android.widget.Button;

import com.grant.restudy.activities.LifeCycleActivity;
import com.grant.restudy.activities.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity:";

    @BindView(R.id.life_cycle_button)
    Button life_cycle_button;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {
        life_cycle_button.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.life_cycle_button:
                startEnterActivity(LifeCycleActivity.class);
                break;
        }
    }


}
