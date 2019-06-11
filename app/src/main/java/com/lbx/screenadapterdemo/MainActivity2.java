package com.lbx.screenadapterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lbx.screenadapter.ScreenAdapt;

/**
 * @author : liboxin
 * @date : 2019/6/11
 * Time: 13:44
 * Desc:高度为准适配
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenAdapt.adaptScreen(this, 720, true);
        setContentView(R.layout.activity_main2);
    }
}
