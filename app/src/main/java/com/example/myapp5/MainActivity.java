package com.example.myapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/* Hello, Anri. I did this in browser! */

public class MainActivity extends AppCompatActivity {
    // Declaring EditTexts:
    EditText nameET, locET;

    // Declaring SharedPreferences:
    SharedPreferences sp;

    // Declaring SharedPreferences.Editor:
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing EditTexts:
        nameET = findViewById(R.id.nameET);
        locET = findViewById(R.id.locET);

        // Initializing SharedPreferences:
        sp = getSharedPreferences("data", MODE_PRIVATE);

        // Initializing SharedPreferences.Editor:
        editor = sp.edit();
    }


    // SAVE button is clicked:
    public void saveClicked(View view) {
        // Saving information in SharedPreferences:
        editor.putString("name", nameET.getText().toString());
        editor.putString("location", locET.getText().toString());
        editor.commit();

        Toast.makeText(this, "SAVED in sp!", Toast.LENGTH_SHORT).show();
    }


    // GO button is clicked:
    public void goClicked(View view) {
        Intent newPage = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(newPage);
    }


    // FRAGMENT button is clicked:
    public void fragClicked(View view) {
        Intent fragPage = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(fragPage);
    }
}
