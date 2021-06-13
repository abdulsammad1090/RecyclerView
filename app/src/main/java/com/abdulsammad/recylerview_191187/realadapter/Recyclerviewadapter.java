package com.abdulsammad.recylerview_191187.realadapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abdulsammad.recylerview_191187.R;
import com.abdulsammad.recylerview_191187.adapter.student;

import java.util.List;

public class Recyclerviewadapter extends RecyclerView.Adapter<Recyclerviewadapter.ViewHolder> {
    List<student> studentList;
    Context context;

    public Recyclerviewadapter(List<student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public Recyclerviewadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerviewadapter.ViewHolder holder, int position)
    {
         student student = studentList.get(position);
         holder.txtname.setText(student.getName());
         holder.txtrollno.setText(student.getRollNo());
         holder.txtcity.setText(student.getCity());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
TextView txtname;
TextView txtrollno;
TextView txtcity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname= itemView.findViewById(R.id.textName);
            txtrollno= itemView.findViewById(R.id.textRollno);
            txtcity= itemView.findViewById(R.id.textCity);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
