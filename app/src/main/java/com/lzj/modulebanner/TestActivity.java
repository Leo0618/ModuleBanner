package com.lzj.modulebanner;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * function : Banner轮播图测试页面.
 *
 * <p>Created by lzj on 2016/3/9.<p/>
 */
public class TestActivity extends AppCompatActivity {
    private BannerHelper mBannerHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBannerHelper = BannerHelper.getInstance().init(findViewById(R.id.banner_rootlayout));

        //delay post for simulate net access
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initData();
            }
        }, 3000);
    }

    private void initData() {
        //test data
        List<BannerBean> dataList = new ArrayList<>();
        dataList.add(new BannerBean(R.mipmap.pic_1, null, "这是第1张图片", null));
        dataList.add(new BannerBean(R.mipmap.pic_2, null, "这是第2张图片", null));
        dataList.add(new BannerBean(R.mipmap.pic_3, null, "这是第3张图片", null));
        dataList.add(new BannerBean(R.mipmap.pic_4, null, "这是第4张图片", null));

        mBannerHelper.startBanner(dataList, new BannerHelper.OnItemClickListener() {
            @Override
            public void onItemClick(BannerBean bean) {
                Toast.makeText(TestActivity.this, "click:" + bean.getDesc(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        mBannerHelper.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mBannerHelper.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mBannerHelper.onDestroy();
        super.onDestroy();
    }
}
