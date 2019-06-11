package com.lbx.screenadapterdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lbx.screenadapter.ScreenAdapt;

/**
 * @author : liboxin
 * @date : 2019/6/11
 * Time: 13:44
 * Desc: 宽度为准适配
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置屏幕的宽度为200dp，对应的一个view若宽度为200dp，则填充满了横向
        ScreenAdapt.adaptScreen(this, 200, false);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this,"123",Toast.LENGTH_SHORT).show();

        //请用下面的代代替原本的toast
//        ScreenAdapt.toast(this,"123");
    }

    public void nextAc(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}
