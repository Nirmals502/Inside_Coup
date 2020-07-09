package com.inside_coup.UI.ui.dashboard;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment_Replacer {
    private Context mcontext;

    public Fragment_Replacer(Context context){
        this.mcontext=context;

    }

    public void Fragment_Replacer(int fragment_id, Fragment fragment_name, FragmentManager manager) {
        //FragmentManager manager = activity.getApplicationContext().getSupportFragmentManager();
        //FragmentManager manager = new Fcontext.getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        //ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

        ft.replace(fragment_id, fragment_name, fragment_name.getClass().getSimpleName());
        ft.commitAllowingStateLoss();
    }
}
