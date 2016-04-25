package com.example.tianfeng.aixaromecafe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class IndexActivity extends AppCompatActivity {

    com.example.tianfeng.actionBar.ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //无标题，全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_index);



        initactionbar();
    }

    private void initactionbar() {
//        actionbar = (com.example.tianfeng.actionBar.ActionBar) findViewById(R.id.index_actionbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }
}
