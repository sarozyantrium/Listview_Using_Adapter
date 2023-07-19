package com.example.listviewusingadaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdaptor extends BaseAdapter
{

    Context context;
    int [] photos;
    String [] names;
    LayoutInflater inflater;

    public MyAdaptor(Context context, int[] photos, String[] names) {
        this.context = context;
        this.photos = photos;
        this.names = names;

        //to inflate the view
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return photos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view=inflater.inflate(R.layout.ui_view,null);
        ImageView imageview=(ImageView) view.findViewById(R.id.img_view);
        TextView textView=(TextView)view.findViewById(R.id.txt_view);
        imageview.setImageResource(photos[i]);
        textView.setText(names[i]);
        return view;
    }
}
