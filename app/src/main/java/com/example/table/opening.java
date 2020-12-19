package com.example.table;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.table.random_pair.random_pair;

public  class opening extends AppCompatActivity {

    Button easy;
    Button tough;

    Boolean eas=false;
    Boolean togh=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        easy = findViewById(R.id.easy);
        tough = findViewById(R.id.tough);



        View.OnClickListener buttons = new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Log.v("table", "Starting Main");
                intent = intent.putExtra("easy", 4);

                startActivity(intent);

            }};
        easy.setOnClickListener(buttons);


        View.OnClickListener button = new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Log.v("table", "Starting Main");
                intent = intent.putExtra("tough", 16);

                startActivity(intent);

            }};
        tough.setOnClickListener(button);
    }}