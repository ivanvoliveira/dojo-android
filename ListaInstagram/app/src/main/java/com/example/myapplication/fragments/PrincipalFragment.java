package com.example.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.PostAdapter;
import com.example.myapplication.model.Post;
import com.example.myapplication.model.Usuario;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    private ArrayList<Post> posts = new ArrayList<>();
    private PostAdapter adapter;

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Post post = new Post();

        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setImagem("https://cdn.pensador.com/img/authors/ho/me/homer-simpson-l.jpg");

        post.setUsuario(usuario);
        post.setCurtidas(15);
        post.setLegenda("Oi");
        post.setImagem("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Itaperuna-10.jpg/300px-Itaperuna-10.jpg");

        posts.add(post);
        posts.add(post);
        posts.add(post);
        posts.add(post);

        RecyclerView recyclerViewPosts = getView().findViewById(R.id.recyclerView_posts);
        recyclerViewPosts.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new PostAdapter(posts);
        recyclerViewPosts.setAdapter(adapter);
    }

}
