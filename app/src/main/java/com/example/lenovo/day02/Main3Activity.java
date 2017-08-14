package com.example.lenovo.day02;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private ListView mListview;
    private FrameLayout mframelayout;
    private List<String> list;
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mListview = (ListView) findViewById(R.id.mListview);
        mframelayout = (FrameLayout) findViewById(R.id.mframelayout);
        initData();
        initAdapter();
      ; initFragment();
    }

    private void initAdapter() {
        Myadapter myadapter=new Myadapter(list,this);
        mListview.setAdapter(myadapter);
    }

    private void initFragment() {
        mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                inithide(fragmentTransaction);
                   switch (i){
                       case 0:

                           if(aFragment==null){
                               aFragment = new AFragment();
                               fragmentTransaction.add(R.id.mframelayout, aFragment);
                               fragmentTransaction.show(aFragment);
                           }else {
                               fragmentTransaction.show(aFragment);
                           }
                           break;
                       case 1:
                           if(bFragment==null){
                               bFragment = new BFragment();
                               fragmentTransaction.add(R.id.mframelayout, bFragment);
                               fragmentTransaction.show(bFragment);
                           }else {
                               fragmentTransaction.show(bFragment);
                           }
                           break;
                       case 2:
                           if(cFragment==null){
                               cFragment = new CFragment();
                               fragmentTransaction.add(R.id.mframelayout, cFragment);
                               fragmentTransaction.show(cFragment);
                           }else {
                               fragmentTransaction.show(cFragment);
                           }
                           break;
                   }
                fragmentTransaction.commit();
            }
        });
    }

    private void inithide(FragmentTransaction fragmentTransaction) {
        if (aFragment!=null){
            fragmentTransaction.hide(aFragment);
        }
        if (bFragment!=null){
            fragmentTransaction.hide(bFragment);
        }
        if (cFragment!=null){
            fragmentTransaction.hide(cFragment);
        }
    }
    private void initData() {
        list = new ArrayList<>();
        list.add("个人简述");
        list.add("个人图片");
        list.add("更多内容");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
         aFragment=new AFragment();
        fragmentTransaction.add(R.id.mframelayout,aFragment);
        fragmentTransaction.commit();
    }
}