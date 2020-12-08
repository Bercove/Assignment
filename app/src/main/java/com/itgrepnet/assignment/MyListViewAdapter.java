package com.itgrepnet.assignment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListViewAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] subTitle;
    private final Integer[] imageId;

    public MyListViewAdapter(Activity context, String[] mainTitle, String[] subTitle, Integer[] imageId) {
        super(context, R.layout.activity_listview_item, mainTitle);

        this.context = context;
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.imageId = imageId;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView = inflater.inflate(R.layout.activity_listview_item, null, true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(mainTitle[position]);
        imageView.setImageResource(imageId[position]);
        subtitleText.setText(subTitle[position]);

        return rowView;
    }
}
