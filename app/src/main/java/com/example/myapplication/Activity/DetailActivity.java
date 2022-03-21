package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        ImageView imageView =findViewById(R.id.imagedounut);
        TextView tvName = findViewById(R.id.tvNameDonutDetails);
        TextView tvGia = findViewById(R.id.textView5);

        Intent in = getIntent();
        int idImg = in.getIntExtra("image",0);
        String name = in.getStringExtra("name");
        String price = in.getStringExtra("price");

        imageView.setImageResource(idImg);
        tvName.setText(name);
        tvGia.setText(price);
    }
}
