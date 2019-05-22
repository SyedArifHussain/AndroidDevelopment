package com.abc.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView CourseList = (RecyclerView) findViewById(R.id.CourseList);
        CourseList.setLayoutManager(new LinearLayoutManager(this));
        String[] Courses= {"Mobile Development", "OOP", "DBMS","Operating System","Calculus","Linear Algebra", "Web Development","Technical Writing","Oral Communication"};
        CourseList.setAdapter(new CoursesAdapter(Courses));
    }
}
