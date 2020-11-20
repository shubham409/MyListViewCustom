package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList <String> obj = new ArrayList<>();
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        obj.add("abc");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,obj);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
    }
}