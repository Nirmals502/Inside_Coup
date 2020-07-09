package com.inside_coup.UI.ui.More;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import com.inside_coup.R;
import com.inside_coup.UI.About_us;
import com.inside_coup.UI.Contact_us;
import com.inside_coup.UI.Login__Screen;
import com.inside_coup.UI.My_profile;
import com.inside_coup.UI.Register_screen;
import com.inside_coup.UI.adapter.CustomExpandableListAdapter;
import com.inside_coup.UI.adapter.ExpandableListDataPump;
import com.inside_coup.UI.ui.Shopping_cart.Shopping_cart_activity;
import com.inside_coup.UI.ui.dashboard.Fragment_Replacer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link More_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class More_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    ImageView Img_cart;

    public More_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment More_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static More_fragment newInstance(String param1, String param2) {
        More_fragment fragment = new More_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_more, container, false);

        expandableListView = (ExpandableListView) root.findViewById(R.id.expandableListView);
        Img_cart = (ImageView) root.findViewById(R.id.imageView4);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(getActivity(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition == 0) {
                    Intent i = new Intent(getActivity(),
                            About_us.class);
                    startActivity(i);
                }else  if (groupPosition == 1) {
                    Intent i = new Intent(getActivity(),
                            Contact_us.class);
                    startActivity(i);
                }
                else  if (groupPosition == 3) {
                    Intent i = new Intent(getActivity(),
                            My_profile.class);
                    startActivity(i);
                }
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {


            }
        });
        Img_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),
                        Shopping_cart_activity.class);
                startActivity(i);
            }
        });
        return root;
    }
}