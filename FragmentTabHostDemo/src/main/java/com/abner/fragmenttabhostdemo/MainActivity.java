package com.abner.fragmenttabhostdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TabHost;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(android.R.id.tabcontent)
    FrameLayout mTabcontent;
    @BindView(android.R.id.tabhost)
    FragmentTabHost mTabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //使FragmentTabHost和FrameLayout关联
        mTabhost.setup(getApplicationContext(), getSupportFragmentManager(), android.R.id.tabcontent);

        //添加tab和其对应的fragment
        TabHost.TabSpec tabSpec = mTabhost.newTabSpec("all");
        tabSpec.setIndicator("综合");
        Bundle bundle =new Bundle();
        bundle.putString("text", "我是综合界面");
        mTabhost.addTab(tabSpec, BlankFragment.class, bundle);


        TabHost.TabSpec tabSpec2 = mTabhost.newTabSpec("tweet");
        tabSpec2.setIndicator("动弹");
        Bundle bundle2 = new Bundle();
        bundle2.putString("text", "我是动弹界面");
        mTabhost.addTab(tabSpec2, BlankFragment.class, bundle2);


        TabHost.TabSpec tabSpec3 = mTabhost.newTabSpec("abb");
        tabSpec3.setIndicator("傻逼");
        Bundle bundle3 = new Bundle();
        bundle3.putString("text", "我是综合");
        mTabhost.addTab(tabSpec3, BlankFragment.class, bundle3);


        TabHost.TabSpec tabSpec4 = mTabhost.newTabSpec("abc");
        tabSpec4.setIndicator("是你");
        Bundle bundle4 = new Bundle();
        bundle4.putString("text", "我是界面");
        mTabhost.addTab(tabSpec4, BlankFragment.class, bundle4);


    }
}
