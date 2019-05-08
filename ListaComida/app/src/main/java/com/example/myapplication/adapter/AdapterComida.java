package com.example.myapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Comida;

import java.util.ArrayList;


public class AdapterComida extends RecyclerView.Adapter<AdapterComida.ViewHolderComida> {
    private ArrayList<Comida> comidas;

    public AdapterComida(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    @NonNull
    @Override
    public ViewHolderComida onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View comidaView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_comida, viewGroup , false);

        return new ViewHolderComida(comidaView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderComida viewHolderComida, int i) {
        Comida comida = comidas.get(i);

        viewHolderComida.descricao.setText(comida.getDescricao());
        viewHolderComida.nome.setText(comida.getNome());
        viewHolderComida.nota.setRating(comida.getNota());
    }

    @Override
    public int getItemCount() {
        return comidas.size();
    }

    public class ViewHolderComida extends RecyclerView.ViewHolder{
        private TextView nome;
        private TextView descricao;
        private RatingBar nota;

        public ViewHolderComida(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textNome);
            descricao = itemView.findViewById(R.id.textDescricao);
            nota = itemView.findViewById(R.id.ratingBarNota);
        }
    }
}
