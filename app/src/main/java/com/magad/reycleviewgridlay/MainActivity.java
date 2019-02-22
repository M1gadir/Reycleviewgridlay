package com.magad.reycleviewgridlay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    Dapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.reyclev);
        adapter = new Dapter(this);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setAdapter(adapter);
    }

}
