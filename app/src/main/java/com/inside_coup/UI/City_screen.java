package com.inside_coup.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.inside_coup.R;
import com.inside_coup.UI.adapter.statelist;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class City_screen extends AppCompatActivity {
    @BindView(R.id.Lv_states)
    ListView Lv_states;
    public ArrayList<String> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_screen);
        ButterKnife.bind(this);
        data.add("Cave creek");
        data.add("Central Corridor");
        data.add("Sun city West");
        data.add("Central Corridor");
        statelist adapter = new statelist(this, data, "city");
        Lv_states.setAdapter(adapter);
        Lv_states.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(City_screen.this,
                        Home_screen.class);
                startActivity(i);

                finish();
            }
        });
    }
}