package com.example.student.customadaptertest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.widget.BaseAdapter;

/**
 * Created by student on 2016/10/11.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    String[] data;

    public MyAdapter(Context context, String[] data){
        this.context = context;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.length;
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
        ViewHolder holder ;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_view, null);
            convertView.setTag(holder);
            holder.tv = (TextView) convertView.findViewById(R.id.textView2);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(data[position] + ":" + position);
        Log.d("ADAPTER", "position:" + position);
        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
    }
}
