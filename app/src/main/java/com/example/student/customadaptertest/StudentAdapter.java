package com.example.student.customadaptertest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.data;

/**
 * Created by student on 2016/10/11.
 */

public class StudentAdapter extends BaseAdapter {
    Context context;
    ArrayList<Student> student_list;

    public StudentAdapter(Context context, ArrayList<Student> student_list){
        this.context = context;
        this.student_list = student_list;
    }
    @Override
    public int getCount() {
        return student_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        StudentAdapter.ViewHolder holder ;
        if (convertView == null)
        {
            holder = new StudentAdapter.ViewHolder();
            convertView = inflater.inflate(R.layout.list_view, null);
            convertView.setTag(holder);
            holder.tv = (TextView) convertView.findViewById(R.id.textView2);
            holder.tv2 = (TextView) convertView.findViewById(R.id.textView3);
        }
        else
        {
            holder = (StudentAdapter.ViewHolder) convertView.getTag();
        }

        holder.tv.setText(student_list.get(position).name);
        holder.tv2.setText(student_list.get(position).tel);

        Log.d("ADAPTER", "position:" + position);
        return convertView;
    }
    static class ViewHolder
    {
        TextView tv, tv2;
    }
}
