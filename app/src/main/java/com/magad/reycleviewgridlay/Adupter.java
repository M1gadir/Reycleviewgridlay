package com.magad.reycleviewgridlay;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

class Adupter extends RecyclerView.ViewHolder {

    ImageView iv;
    TextView tv;
    LinearLayout rl;
    public Adupter(@NonNull View itemView, Context context) {
        super(itemView);
        iv = itemView.findViewById(R.id.imdet);
        tv = itemView.findViewById(R.id.tvdet);
        rl = itemView.findViewById(R.id.rlv);
    }
}
