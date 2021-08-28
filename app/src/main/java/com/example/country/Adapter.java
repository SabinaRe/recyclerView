package com.example.country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {


    class holder extends RecyclerView.ViewHolder {

        TextView code, countryN;
        CircleImageView flag;

        public holder(@NonNull View itemView) {
            super(itemView);
            code = itemView.findViewById(R.id.code);
            countryN = itemView.findViewById(R.id.countryN);
            flag = itemView.findViewById(R.id.flag);

        }
    }

    String data[], sata[];
    int img[];

    public Adapter(String[] data, String[] sata, int[] img)
    {
        this.data = data;
        this.sata = sata;
        this.img = img;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.countryN.setText(data[position]);
        holder.code.setText(sata[position]);
        holder.flag.setImageResource(img[position]);



    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
