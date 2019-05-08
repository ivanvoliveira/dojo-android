package com.example.myapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Time;

import java.util.ArrayList;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.ViewHolderTime>{
    private ArrayList<Time> times;

    public AdapterTimes(ArrayList<Time> times) {
        this.times = times;
    }

    @NonNull
    @Override
    public ViewHolderTime onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_times, viewGroup, false);

        return new ViewHolderTime(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTime viewHolderTime, int posicao) {
        Time time = times.get(posicao);
        viewHolderTime.textViewNome.setText(time.getNome());
        viewHolderTime.textViewTitulo.setText(time.getTitulo()+"");
    }

    @Override
    public int getItemCount() {
        return times.size();
    }

    public class ViewHolderTime extends RecyclerView.ViewHolder{
        private TextView textViewNome;
        private TextView textViewTitulo;
        //private ImageView imageViewTime;

        public ViewHolderTime(@NonNull View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewTitulo= itemView.findViewById(R.id.textViewTitulos);
            //imageView1 = itemView.findViewById(R.id.imageViewTime);
        }
    }


}
