package com.example.assignments.Notes.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignments.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] countryNames, currencies;
    private int[] flags;
    private LayoutInflater layoutInflater;
    private View[] views;

    public CustomAdapter(Context context, String[] countryNames, int[] flags, String[] currencies) {
        this.context = context;
        this.countryNames = countryNames;
        this.currencies = currencies;
        this.flags = flags;
        this.layoutInflater = LayoutInflater.from(context); // creating a new layoutInflater instance associated with a particular context
        this.views = new View[countryNames.length]; //*** imp

        for(int position = 0; position < countryNames.length; ++position) {
            views[position] = layoutInflater.inflate(R.layout.list_view2_item, null);
            TextView countryName = views[position].findViewById(R.id.countryNameTxt);
            TextView currency = views[position].findViewById(R.id.countryCurrencyTxt);
            ImageView flag = views[position].findViewById(R.id.countryFlagImg);

            countryName.setText("Country: " + countryNames[position]);
            currency.setText("Currency: " + currencies[position]);
            flag.setImageResource(flags[position]);
        }
    }

    @Override
    public int getCount() {
        return views.length;
    }

    @Override
    public Object getItem(int position) {
        ArrayList<String> list = new ArrayList<>(); // or can return a hash map also, depends on what u want
        list.add(countryNames[position]);
        list.add(Integer.toString(flags[position]));
        list.add(currencies[position]);
        return list;
    }

    @Override
    public long getItemId(int position) {
        return views[position].getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return views[position];
    }

}
