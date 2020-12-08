package com.itgrepnet.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView listViewData;

    String[] mainTitle = {"House","Dog","Flower","Computer","School","Book"};

    String[] subTitle = {"Sub Title 1", "Sub Title 2", "Sub Title 3", "Sub Title 4", "Sub Title 5", "Sub Title 6"};

    Integer[] imageId={
            R.drawable.house,R.drawable.dog,
            R.drawable.flower,R.drawable.computer,
            R.drawable.school,R.drawable.book
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listViewData = findViewById(R.id.listViewData);
        MyListViewAdapter adapter = new MyListViewAdapter(this, mainTitle, subTitle, imageId);
        listViewData.setAdapter(adapter);
    }
}