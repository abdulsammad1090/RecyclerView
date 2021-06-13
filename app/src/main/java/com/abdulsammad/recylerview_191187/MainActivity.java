package com.abdulsammad.recylerview_191187;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abdulsammad.recylerview_191187.adapter.student;
import com.abdulsammad.recylerview_191187.realadapter.Recyclerviewadapter;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    List<student> studentList= new ArrayList<>();
    Recyclerviewadapter recyclerviewadapter;
    RecyclerView recyclerView
            Button btnremove;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnremove=findViewById(R.id.btnremove);
        recyclerView=findViewById(R.id.recyclerview191187);
        btnremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentList.remove(getAetAdapterposition());
            }
        });

        studentList.add(new student("Abdul Sammad" , "191187", "Rawalpindi"));
        studentList.add(new student("Abdul Hadi" , "191187", "Rawalakot"));
        studentList.add(new student("Abdul Razzak" , "191187", "Mirpur"));
        recyclerviewadapter =new Recyclerviewadapter(studentList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerviewadapter);


    }



}