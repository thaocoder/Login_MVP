package com.example.login_mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.login_mvp.R;
import com.example.login_mvp.databinding.ActivityMainBinding;
import com.example.login_mvp.listener.MyClickHandlers;
import com.example.login_mvp.presenter.MyPresenter;

public class MainActivity extends AppCompatActivity {
    MyClickHandlers handlers;
    MyPresenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPresenter = new MyPresenter();

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        handlers = new MyClickHandlers(this){
            @Override
            public void onButtonClick(View view) {
                super.onButtonClick(view);
                String username = binding.edtUsername.getText()+"";
                String password = binding.edtPassword.getText()+"";
                myPresenter.checkUsernameAndPassword(username,password);
            }
        };
        binding.setHandlers(handlers);
    }
}
