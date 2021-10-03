package com.example.checkpoint3for5236;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChooseDiscussionBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_discussion_board);

//        Button course = (Button) findViewById(R.id.button);
        RecyclerView view = (RecyclerView) findViewById((R.id.recyclerView));

//        course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(ChooseDiscussionActivity.this, DiscussionBoardActivity.class));
//            }
//        });

        List<BoardItem> items = new ArrayList<BoardItem>();
        items.add(new BoardItem("CSE 5236"));
        items.add(new BoardItem("CSE 3541"));
        items.add(new BoardItem("CSE 3341"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BoardAdaptor(getApplicationContext(), items));

    }
}