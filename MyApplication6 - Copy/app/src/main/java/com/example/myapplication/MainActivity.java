package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item>items =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item ice1 =new Item("lolo",0.5,R.drawable.name);
        Item ice2 =new Item("chocolate ice cream",0.725,R.drawable.name2);
        Item ice3 =new Item("sandwish",0.25,R.drawable.name3);

       items.add(ice1);
        items.add(ice2);
        items.add(ice3);
        itemmm adpter =new itemmm(this,0,items);
        
    }
}