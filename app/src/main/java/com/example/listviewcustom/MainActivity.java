package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList <Word> obj = new ArrayList<>();
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));
        obj.add(new Word("abc",R.drawable.img));

        MyAdapter myAdapter = new MyAdapter(this,obj);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(myAdapter);

    }
}