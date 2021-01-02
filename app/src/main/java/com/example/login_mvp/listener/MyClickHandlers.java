package com.example.login_mvp.listener;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandlers {
    Context context;

    public MyClickHandlers(Context context) {
        this.context = context;
    }

    public void onButtonClick(View view) {
        Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
}
