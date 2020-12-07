package com.itgrepnet.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView listViewData;

    // Array of strings...
    String[] objects = {"House","Dog","Flower","Computer","School","Book"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview_item, objects);

        listViewData = findViewById(R.id.listViewData);
        listViewData.setAdapter(adapter);
    }
}