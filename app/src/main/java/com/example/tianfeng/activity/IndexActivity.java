package com.example.tianfeng.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.tianfeng.aixaromecafe.R;


public class IndexActivity extends AppCompatActivity implements View.OnClickListener{

    //�����ͼ
    private Button mapBut;
    //����ͨ��
    private Button myfriendsBut;
    //����coffee
    private Button coffeeBut;
    //����ȯ
    private Button couponBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //�ޱ��⣬ȫ��
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_index);


        initlayout();
    }

    /**
     * ��ʼ�����֣������ؼ�
     */
    private void initlayout() {
        mapBut = (Button) findViewById(R.id.mapBut);
        mapBut.setOnClickListener(this);
        coffeeBut = (Button) findViewById(R.id.coffeeBut);
        coffeeBut.setOnClickListener(this);
        couponBut = (Button) findViewById(R.id.coupon);
        couponBut.setOnClickListener(this);
        myfriendsBut = (Button)findViewById(R.id.friendsBut);
        myfriendsBut.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mapBut:
                Toast.makeText(IndexActivity.this,"mapbut",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setClass(IndexActivity.this,Map.class);
                startActivity(intent);
                break;
            case R.id.coffeeBut:
                break;
            case R.id.friendsBut:
                break;
            case R.id.coupon:
                break;
        }

    }
}
