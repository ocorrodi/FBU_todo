package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;
import java.util.*;


public class MainActivity extends AppCompatActivity {

    List<String> items;

    Button btnadd;
    EditText eti;
    RecyclerView rvitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = findViewById(R.id.btnadd);
        eti = findViewById(R.id.eti);
        rvitems = findViewById(R.id.rvitems);

        new ItemsAdapter()

        eti.setText("this is from java");
        items = new ArrayList<>();
        items.add("buy milk");
        items.add("go to gym");
        items.add("have fun");
    }
}