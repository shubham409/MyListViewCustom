package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,String.valueOf(position) , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("position",String.valueOf(position));
                startActivity(intent);
            }
        });

    }
}