package com.magad.reycleviewgridlay;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class Dapter extends RecyclerView.Adapter<Adupter> {

    Context context;
    String[] haha = {"mobil","motor","perahu","tank","kerata","pesawat"};
    int[] gam = {R.drawable.car,R.drawable.motorcycle,R.drawable.cargoship,R.drawable.tank,R.drawable.cargo,R.drawable.airplane};
    public Dapter(Context context) {
        this.context= context;


    }

    @NonNull
    @Override
    public Adupter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.listreycyle,null);
        return new Adupter ( v , context );
    }

    @Override
    public void onBindViewHolder(@NonNull Adupter adupter, final int i) {
    adupter.iv.setImageResource(gam[i]);
    adupter.tv.setText(haha[i]);
    adupter.rl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent t = new Intent(context, Detail.class);
            t.putExtra("a",haha[i]);
            t.putExtra("",gam[i]);
            context.startActivity(t);
        }
    });
    }

    @Override
    public int getItemCount() {
        return haha.length;
    }
}
