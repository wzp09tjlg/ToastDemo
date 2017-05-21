package com.example.wuzp.toastdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.wuzp.toastdemo.widget.MsgView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
       btnClick = $(R.id.btn_click);
        btnClick.setOnClickListener(this);
    }

    private <T> T $(int id){
        return (T)findViewById(id);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_click:
                MsgView.getInstance().show(this,"还不错的Toast,样式比系统的强点");
                break;
        }
    }
}
