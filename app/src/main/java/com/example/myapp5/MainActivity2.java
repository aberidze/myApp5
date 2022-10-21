package com.example.myapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    // Declaring EditText:
    EditText textET;

    // Declaring SharedPreferences:
    SharedPreferences sp;

    // Declaring SharedPreferences.Editor:
    SharedPreferences.Editor editor;

    // Declaring String:
    String fullInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initializing EditText:
        textET = findViewById(R.id.textET);

        // Initializing SharedPreferences:
        sp = getSharedPreferences("data", MODE_PRIVATE);

        // Initializing SharedPreferences.Editor:
        editor = sp.edit();
    }


    // GET button is clicked. Name and Location must be shown:
    public void getClicked(View view) {
        fullInfo = new String("NAME: " + sp.getString("name", "...") +
                ". LOCATION: " + sp.getString("location", "...") + ".");

        textET.setText(fullInfo);
    }
}