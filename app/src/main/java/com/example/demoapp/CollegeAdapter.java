package com.example.demoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.ViewHolder> {

    private List<College> colleges;
    ItemClicked activity;

    public interface ItemClicked{
        void onItemClicked(int index);
    }

    public CollegeAdapter(Context context, List<College> list){
        colleges = list;
        activity = (ItemClicked)context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_city,tv_prov,tv_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_prov = itemView.findViewById(R.id.tv_prov);
            tv_city = itemView.findViewById(R.id.tv_city);

            itemView.setOnClickListener(v -> {

                activity.onItemClicked(colleges.indexOf(v.getTag()));
            });
        }
    }

    @NonNull
    @Override
    public CollegeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.college_row_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollegeAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(colleges.get(position));

        holder.tv_name.setText(colleges.get(position).getName());
        holder.tv_city.setText(colleges.get(position).getCity());
        holder.tv_prov.setText(colleges.get(position).getProvince());
    }

    @Override
    public int getItemCount() {
        return colleges.size();
    }
}
