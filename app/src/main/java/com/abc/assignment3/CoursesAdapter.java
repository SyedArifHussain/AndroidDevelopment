package com.abc.assignment3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesView>
{
    private String[] data;
    public CoursesAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public CoursesView onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_items, parent,false);
        return new CoursesView(view);
    }

    @Override
    public void onBindViewHolder( CoursesView holder, int position)
    {
        String title=data[position];
        holder.PageTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CoursesView extends RecyclerView.ViewHolder
    {
        ImageView Img_icon;
        TextView PageTitle;
        public CoursesView(View itemView) {
            super(itemView);
            Img_icon =(ImageView) itemView.findViewById(R.id.Img_icon);
            PageTitle = (TextView) itemView.findViewById(R.id.PageTitle);
        }
    }
}
