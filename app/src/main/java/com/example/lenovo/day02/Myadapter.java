package com.example.lenovo.day02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Myadapter extends BaseAdapter {
    private List<String> list;
    private Context context;
    private MyHolder myholder;

    public Myadapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            myholder = new MyHolder();
            view=LayoutInflater.from(context).inflate(R.layout.button_main,null);
            myholder.textView=(TextView)view.findViewById(R.id.textView);
            view.setTag(myholder);
        }else {
            myholder=(MyHolder)view.getTag();
        }
         myholder.textView.setText(list.get(i));
        return view;
    }
    class MyHolder{
        TextView textView;

    }
}
