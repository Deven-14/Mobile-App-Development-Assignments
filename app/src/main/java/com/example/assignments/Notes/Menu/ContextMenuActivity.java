package com.example.assignments.Notes.Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {

    String[] contacts = {"Ajay", "Sachin", "Sumit", "Tarun", "Yogesh"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        ArrayAdapter<String> contactsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        listView = findViewById(R.id.contacts);
        listView.setAdapter(contactsAdapter);

        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Select The Action");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "Here", Toast.LENGTH_SHORT).show();
        switch(item.getItemId()) {
            case R.id.call:
                Toast.makeText(this, "calling", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sms:
                Toast.makeText(this, "sending sms", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onContextItemSelected(item);
        }
        return true;
    }
}