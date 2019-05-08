package com.example.myapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterComida;
import com.example.myapplication.model.Comida;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComidaFragment extends Fragment {

    private ArrayList<Comida> comidas = new ArrayList<>();
    private AdapterComida adapterComida;
    private RecyclerView recyclerView;

    public ComidaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comida, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Comida comida1 = new Comida();
        comida1.setDescricao("Muito boa");
        comida1.setNome("Biscoitinhos Amanteigados");
        comida1.setNota(5);
        comidas.add(comida1);

        Comida comida;

        for (int i = 0; i < 10; i++){
            comida = new Comida("Comida " + i, "Descrição " + i, new Random().nextInt(6));
            comidas.add(comida);
        }

        adapterComida = new AdapterComida(comidas);
        recyclerView.setAdapter(adapterComida);

        return view;
    }

}
