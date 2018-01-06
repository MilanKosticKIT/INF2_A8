package com.uni.admin.aufgabe_8;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MK on 06.01.18.
 */

public class TaskAdapter extends ArrayAdapter {

    public static class ViewHolder{
        public TextView title;
        public TextView note;
    }
    public TaskAdapter(Context context, ArrayList<Task> aTasks) {
        super(context, 0, aTasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final Task task = (Task) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.task_overview, parent, false);
            viewHolder.title = (TextView)convertView.findViewById(R.id.taskTitle);
            viewHolder.note = (TextView)convertView.findViewById(R.id.taskNote);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.title.setText(task.getTilte());
        viewHolder.note.setText(task.getNote());
        // Return the completed view to render on screen
        return convertView;
    }
}
