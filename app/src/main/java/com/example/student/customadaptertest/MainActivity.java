package com.example.student.customadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] data;
    ArrayList<Student> student_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        data = new String[]{"AA", "BBB", "CC22", "DD44", "EEEEE555","AA", "BBB", "CC22", "DD44", "EEEEE555","AA", "BBB", "CC22", "DD44", "EEEEE555"};
        student_list = new ArrayList<>();
        student_list.add(new Student("AA", "11111"));
        student_list.add(new Student("BB", "2222222"));
        student_list.add(new Student("CC", "333333"));
        student_list.add(new Student("DD", "4444444"));
        MyAdapter adapter = new MyAdapter(MainActivity.this, data);
        StudentAdapter studentAdapter = new StudentAdapter(MainActivity.this,student_list);
        listView.setAdapter(adapter);

    }
}
