package com.example.checkpoint3for5236;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChooseDiscussionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_discussion);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("About HW1","I have a question about the first pro..."));
        items.add(new Item("About HW2","I have a question about the first pro..."));
        items.add(new Item("About HW3","I have a question about the first pro..."));
        items.add(new Item("About HW4","I have a question about the first pro..."));
        items.add(new Item("About HW5","I have a question about the first pro..."));
        items.add(new Item("About HW6","I have a question about the first pro..."));
        items.add(new Item("About HW1","I have a question about the first pro..."));
        items.add(new Item("About HW2","I have a question about the first pro..."));
        items.add(new Item("About HW3","I have a question about the first pro..."));
        items.add(new Item("About HW4","I have a question about the first pro..."));
        items.add(new Item("About HW5","I have a question about the first pro..."));
        items.add(new Item("About HW6","I have a question about the first pro..."));


        recyclerView.setLayoutManager(new LinearLayoutManager(this
        ));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}