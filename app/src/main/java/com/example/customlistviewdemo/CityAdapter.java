package com.example.customlistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by James Ooi on 19/7/2017.
 */

public class CityAdapter extends ArrayAdapter<City> {
    private ArrayList<City> data;
    Context mContext;

    private static class ViewHolder {
        TextView txtName;
        TextView txtCountry;
    }

    public CityAdapter(ArrayList<City> data, Context context) {
        super(context, R.layout.list_item, data);
        this.data = data;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        City city = getItem(position);
        ViewHolder viewHolder;

        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);

            viewHolder.txtName = (TextView)convertView.findViewById(R.id.item_name);
            viewHolder.txtCountry = (TextView)convertView.findViewById(R.id.item_country);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.txtName.setText(city.getName());
        viewHolder.txtCountry.setText(city.getCountry());

        return convertView;
    }
}
