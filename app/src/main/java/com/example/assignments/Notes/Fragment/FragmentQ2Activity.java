package com.example.assignments.Notes.Fragment;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentManager; // IMPORTANT, IT DOESN'T WORK WITH androidx.fragment.app.FragmentManager
import android.app.FragmentTransaction;

import com.example.assignments.R;

import android.os.Bundle;
import android.widget.Button;

public class FragmentQ2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_q2);

        Button frag1 = findViewById(R.id.fragment1);
        Button frag2 = findViewById(R.id.fragment2);

        frag1.setOnClickListener(v -> {
            loadFragment(new FragmentQ2F1());
        });

        frag2.setOnClickListener(v -> {
            loadFragment(new FragmentQ2F2());
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}