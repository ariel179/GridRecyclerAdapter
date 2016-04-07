package com.example.ariel.gridrecycleradapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    CustomRecyclerAdapter customRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.addItemDecoration(new SpaceItemDecorator(30));
        ArrayList<String> array = new ArrayList<>();
        array.add("Item 1");
        array.add("Item 2");
        array.add("Item 3");
        array.add("Item 4");
        array.add("Item 5");
        array.add("Item 6");
        array.add("Item 7");
        customRecyclerAdapter = new CustomRecyclerAdapter(array);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(customRecyclerAdapter);


    }
}
