package com.example.lenovo.day02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/8/11.
 */

public class CircleView extends View {
    public CircleView(Context context) {
        super(context);
    }
//在xml文件中使用控件时会调用两个构造参数的构造方法
    //明确是否使用默认样式
    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }
    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    //Context context 上下文引用
    //AttributeSet attrs 自定义属性集
    //int defStyleAttr  默认样式
    //int defStyleRes 默认资源引用
    public CircleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawCircle(50,50,20,paint);
    }
}
