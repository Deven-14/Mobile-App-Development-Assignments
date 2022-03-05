package com.example.assignments.Notes.Menu;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignments.MainActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        button = findViewById(R.id.popupMenuBtn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.popupMenuBtn) {
            PopupMenu popupMenu = new PopupMenu(PopupMenuActivity.this, button);

            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
//                    switch(item.getItemId()) {
//                        case R.id.one:
//                            Toast.makeText(PopupMenuActivity.this, "one", Toast.LENGTH_SHORT).show();
//                            break;
//                        case R.id.two:
//                            Toast.makeText(PopupMenuActivity.this, "two", Toast.LENGTH_SHORT).show();
//                            break;
//                        case R.id.three:
//                            Toast.makeText(PopupMenuActivity.this, "three", Toast.LENGTH_SHORT).show();
//                            break;
//                        default:
//                            return false;
//                    }
                    Toast.makeText(PopupMenuActivity.this, "You Clicked: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                    return true;
                }
            });

            popupMenu.show();
        }
    }

}