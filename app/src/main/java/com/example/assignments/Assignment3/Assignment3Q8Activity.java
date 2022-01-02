package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.assignments.R;

public class Assignment3Q8Activity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private static final String TAG = "Assignment3Q8Activity";
    private Button loginBtn;
    private Switch switchTheme;
    private ImageButton logoImgBtn;
    private EditText editTxtUserName, editTxtPassword;
    private ToggleButton showPwdToggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q8);

        loginBtn = findViewById(R.id.signUpBtn);
        logoImgBtn = findViewById(R.id.logoImgBtn);
        editTxtUserName = findViewById(R.id.editTxtUserName);
        editTxtPassword = findViewById(R.id.editTxtPassword);
        showPwdToggleBtn = findViewById(R.id.showPwdToggleBtn);
        switchTheme = findViewById(R.id.switchTheme);

        loginBtn.setOnClickListener(this);
        logoImgBtn.setOnClickListener(this);
        showPwdToggleBtn.setOnClickListener(this);
        switchTheme.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.signUpBtn:
                String loginToast = "SignUp Successful" + "\nWelcome: " + editTxtUserName.getText();
                Toast.makeText(this, loginToast, Toast.LENGTH_SHORT).show();
                editTxtUserName.setText("");
                editTxtPassword.setText("");
                break;
            case R.id.logoImgBtn:
                Toast.makeText(this, "Instagram Logo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.showPwdToggleBtn:
                if(showPwdToggleBtn.isChecked()) {
                    editTxtPassword.setTransformationMethod(null);
                } else {
                    editTxtPassword.setTransformationMethod(new PasswordTransformationMethod());
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // PHONE SHOULD BE IN LIGHT MODE TO SEE THIS WORK PROPERLY
        if(isChecked) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}