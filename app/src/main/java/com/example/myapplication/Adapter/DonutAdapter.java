package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.myapplication.Activity.DetailActivity;
import com.example.myapplication.model.Donut;
import com.example.myapplication.R;

import java.util.ArrayList;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Donut> donuts;
    private int idLayout;
    private int index = -1;

    public DonutAdapter(Context context, ArrayList<Donut> donuts, int idLayout) {
        this.context = context;
        this.donuts = donuts;
        this.idLayout = idLayout;
    }

    @Override
    public int getCount() {
        if(donuts.size() != 0 && !donuts.isEmpty())
            return donuts.size();
        return 0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup,false);
        }
        TextView tvName =view.findViewById(R.id.txtTen);
        TextView tv2 = view.findViewById(R.id.txt2);
        TextView tvGia = view.findViewById(R.id.txtGia);
        ImageView img = view.findViewById(R.id.imgThing);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.itemConStraintLayout);
        final Donut donut = donuts.get(i);

        if(donuts != null && !donuts.isEmpty()) {
            tvName.setText(donut.getName());
            tv2.setText(donut.getSpicy());
            tvGia.setText(donut.getFormatPrice());
            img.setImageResource(donut.getImage());
        }

        ImageButton btnCOng = view.findViewById(R.id.btnCong);
        btnCOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(context, DetailActivity.class);
                Bundle bundle =new Bundle();
                bundle.putInt("image",donut.getImage());
                bundle.putString("name",donut.getName());
                bundle.putString("price",donut.getFormatPrice());

                in.putExtras(bundle);
                context.startActivity(in);
            }
        });

        if(index == i) {
            constraintLayout.setBackgroundColor(Color.GRAY);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }
        return view;


    }
}
