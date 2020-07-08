package com.inside_coup.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.inside_coup.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Welcome_screen extends Activity {
    @BindView(R.id.button)
    Button Btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void Login() {
        Intent i = new Intent(Welcome_screen.this,
                Register_screen.class);
        startActivity(i);

        finish();

    }
}