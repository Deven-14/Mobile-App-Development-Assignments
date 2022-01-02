package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.assignments.R;

public class Assignment3Q3Activity extends AppCompatActivity implements View.OnClickListener{

//    DOING IT LITTLE DIFFERENT THAN THE QUESTION ASKED, HERE IT'LL PUT THE TEXT IN EDIT TEXT TO TEXT VIEW

    private TextView txtName;
    private EditText editText1, editText2;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q3);

        txtName = findViewById(R.id.txtName);
        editText1 = findViewById(R.id.editTxtName1);
        editText2 = findViewById(R.id.editTxtName2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name;
        switch(v.getId())
        {
            case R.id.btn1:
                name = editText1.getText().toString();
                break;
            case R.id.btn2:
                name = editText2.getText().toString();
                break;
            default:
                name = "Display Name";
                break;
        }
        txtName.setText(name);
    }
}