package com.example.assignments.Notes.listView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignments.MainActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ListView2Activity extends AppCompatActivity {

    private String[] countryNames = {"India", "China", "USA", "UK"};
    private int[] flags = {
            R.drawable.ic_baseline_check_box_24,
            R.drawable.ic_baseline_check_box_outline_blank_24,
            R.drawable.ic_baseline_radio_button_checked_24,
            R.drawable.ic_baseline_radio_button_unchecked_24
    };
    private String[] currencies = {
            "Rupees",
            "Abc",
            "Def",
            "Ghi"
    };
    private ListView countriesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        ArrayList<HashMap<String, String>> countriesList = new ArrayList<>();
        countriesListView = findViewById(R.id.countriesListView);

        for(int i = 0; i < countryNames.length; ++i) {
            HashMap<String, String> country = new HashMap<>();
            country.put("name", "Country: " + countryNames[i]);
            country.put("currency", "Currency: " + currencies[i]);
            country.put("flag", Integer.toString(flags[i]));
            countriesList.add(country);
        }

        String[] fromCursor = {"name", "currency", "flag"};
        int[] toViews = {R.id.countryNameTxt, R.id.countryCurrencyTxt, R.id.countryFlagImg};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), countriesList, R.layout.list_view2_item, fromCursor, toViews);
        countriesListView.setAdapter(adapter);
        countriesListView.setOnItemClickListener(itemClickListener);
    }

    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            LinearLayout linearLayoutParent = (LinearLayout) view;
            LinearLayout linearLayoutChild = (LinearLayout) linearLayoutParent.getChildAt(1);
            TextView countryNameTxt = (TextView) linearLayoutChild.getChildAt(0);
            Toast.makeText(ListView2Activity.this, countryNameTxt.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };
}