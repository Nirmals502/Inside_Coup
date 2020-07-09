package com.inside_coup.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.inside_coup.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Register_screen extends AppCompatActivity {
    @BindView(R.id.button4)
    Button Regiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button4)
    void Explore() {
        Intent i = new Intent(Register_screen.this,
                State_List_screen.class);
        startActivity(i);

        finish();

    }
}