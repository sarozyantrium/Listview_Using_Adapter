package com.example.listviewusingadaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    //These are data source
    int[] photo={R.drawable.airline_seat,R.drawable.alarm,R.drawable.android,R.drawable.assistant_walker,R.drawable.bank,R.drawable.runner,R.drawable.airline_seat,R.drawable.alarm,R.drawable.android,R.drawable.assistant_walker,R.drawable.bank,R.drawable.runner,R.drawable.airline_seat,R.drawable.alarm,R.drawable.android,R.drawable.assistant_walker,R.drawable.bank,R.drawable.runner};
    String [] names={"airline seat","alarm","android","assitant walker","bank","runner","airline seat","alarm","android","assitant walker","bank","runner","airline seat","alarm","android","assitant walker","bank","runner","airline seat","alarm","android","assitant walker","bank","runner"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.list_view);

        MyAdaptor myAdaptor=new MyAdaptor(getApplicationContext(),photo,names); //mathi pahila photo bhae photo or names bhae names hunuparxa second arguement ma
        listView.setAdapter(myAdaptor);
    }
}