package com.inside_coup.UI.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.inside_coup.R;
import com.inside_coup.UI.adapter.statelist;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class HomeFragment extends Fragment {
    @BindView(R.id.Lv_states)
    ListView Lv_states;
    public ArrayList<String> data = new ArrayList<>();
    private Unbinder unbinder;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        data.add("Automotive");
        data.add("Beauty");
        data.add("Dinning");
        data.add("Entertainment");
        statelist adapter = new statelist(getActivity(), data, "cityg");
        Lv_states.setAdapter(adapter);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, root);
        //ButterKnife.bind(getActivity());
        return root;
    }
}