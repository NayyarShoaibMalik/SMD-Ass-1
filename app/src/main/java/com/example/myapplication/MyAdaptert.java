package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdaptert extends RecyclerView.Adapter<MyAdaptert.MyViewHolder> {

    List<Model> ls;
    Context context;
    public MyAdaptert(Context context, List <Model> ls){
        this.context=context;
        this.ls=ls;


}

    @NonNull
    @Override
    public MyAdaptert.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
        /*
        View row = LayoutInflater
                .from(context)
                .inflate(R.layout.row,parent,false);
         return new MyViewHolder(row);
        */

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.n.setText(ls.get(position).getName());
        holder.id.setText(ls.get(position).getId());
        /*
        holder.item.setOnClickListener(new View.OnClickListener()
        {
            @override
            public void onclick(View view)
            {

            }
        });

         */

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView n;
        TextView id;

        public MyViewHolder(@NonNull View itemView){

            super(itemView);
            /*
            n  =itemView.findViewById(R.id.name);
            id =itemView.findViewById(R.id.idu);

             */
        }
    }
}
