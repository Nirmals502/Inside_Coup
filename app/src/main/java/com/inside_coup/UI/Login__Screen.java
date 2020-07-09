package com.inside_coup.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.inside_coup.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login__Screen extends AppCompatActivity {
    @BindView(R.id.textView6)
    TextView Txt_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login___screen);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.textView6)
    void  Signup(){
        Intent i = new Intent(Login__Screen.this,
                Register_screen.class);
        startActivity(i);

        finish();
    }
}