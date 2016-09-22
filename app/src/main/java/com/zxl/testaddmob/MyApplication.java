package com.zxl.testaddmob;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * @Description:
 * @Author: zxl
 * @Date: 22/9/16 PM2:26.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, getString(R.string.admob_application));
    }
}
