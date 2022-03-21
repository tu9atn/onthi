package com.example.myapplication.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.myapplication.Adapter.DonutAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Donut> list;
    private ListView listView;
    private ImageButton btnCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        /*listView= findViewById(R.id.idListViewDonut);
        list = new ArrayList<>();
        list.add(new Donut(1, "Tasty Donut", "Spicy tasty donut family", 10, R.drawable.donut_yellow_1));
        list.add(new Donut(2, "Pink Donut", "Spicy tasty donut family", 20, R.drawable.green_donut_1));
        list.add(new Donut(3, "Floating Donut", "Spicy tasty donut family", 30, R.drawable.green_donut_1));
        list.add(new Donut(4, "Red Donut", "Spicy tasty donut family", 40, R.drawable.donut_red_1));
        DonutAdapter adapter = new DonutAdapter(this, list,R.layout.item_listview);
        listView.setAdapter(adapter);

        EditText editText = findViewById(R.id.editTextTextPersonName);
        ArrayList<Donut> dsDonut = new ArrayList<>();
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction() == keyEvent.ACTION_DOWN && keyEvent.getKeyCode() == keyEvent.KEYCODE_ENTER)
                {
                    String name = editText.getText().toString().trim();
                    for(Donut item : list)
                    {
                        if(item.getName().equals(name))
                        {
                            dsDonut.add(item);
                            DonutAdapter adapter = new DonutAdapter(MainActivity.this,dsDonut,R.layout.item_listview);
                            listView.setAdapter(adapter);

                        }
                    }
                }
                return false;
            }
        });*/
    }
}