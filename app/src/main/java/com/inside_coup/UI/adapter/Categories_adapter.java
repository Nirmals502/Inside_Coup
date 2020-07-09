package com.inside_coup.UI.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.inside_coup.R;

import java.util.ArrayList;

public class Categories_adapter extends BaseAdapter {
    private Context context; //context
    private String[] items; //data source of the list com.inside_coup.UI.adapter
    public ArrayList<String> data = new ArrayList<>();
    String Str_type = "";

    //public constructor
    public Categories_adapter(Context context, ArrayList<String> data, String Screen) {
        this.context = context;
        this.data = data;
        this.Str_type = Screen;
    }

    @Override
    public int getCount() {
        return data.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return data.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        ViewHolder___ viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder___();
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.lv_states, parent, false);
            viewHolder.Img_logo=(ImageView)convertView.findViewById(R.id.imageView3);
            if(Str_type.contentEquals("city")){
                viewHolder.Img_logo.setVisibility(View.GONE);
            }

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder___) convertView.getTag();
            result = convertView;

        }

        // returns the view for the current row
        return convertView;
    }
}

class ViewHolder___ {
    TextView Txt_program, Txt_retailor, Txt_expriy;
    Button Btn_save;
    ImageView Img_logo;
}

