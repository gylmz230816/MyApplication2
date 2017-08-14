package com.example.lenovo.day02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagerview;
    private Animation myAnimation_alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagerview = (ImageView) findViewById(R.id.imagerview);
        Animation animation = new RotateAnimation(0, 360);
        animation.setDuration(500);
        animation.setRepeatCount(3);
        animation.setFillAfter(true);//设置为true，动画转化结束后被应用
        imagerview.startAnimation(animation);//开始动画
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
           public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
               startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }

           @Override
           public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
