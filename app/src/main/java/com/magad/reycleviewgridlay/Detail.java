package com.magad.reycleviewgridlay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    ImageView iv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        iv = findViewById(R.id.imdetail);
        tv = findViewById(R.id.tvdetai);

        iv.setImageResource(getIntent().getIntExtra("",0));
        tv.setText(getIntent().getStringExtra("a"));
    }
}
