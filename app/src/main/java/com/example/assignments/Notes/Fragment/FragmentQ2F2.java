package com.example.assignments.Notes.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.app.Fragment;

import com.example.assignments.R;

public class FragmentQ2F2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q2_f2, container, false);

        Button btn = view.findViewById(R.id.fragmentq2f2);
        btn.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
