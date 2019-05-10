package com.example.myapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolderPost> {
    private ArrayList<Post> posts;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolderPost onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_adapter, viewGroup, false);
        return new ViewHolderPost(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPost viewHolderPost, int i) {
        Post post = posts.get(i);

        viewHolderPost.textViewNome.setText(post.getUsuario().getNome());
        viewHolderPost.textViewNomeLegenda.setText(post.getUsuario().getNome());
        viewHolderPost.textViewPostLegenda.setText(post.getLegenda());
        viewHolderPost.textViewPostCurtida.setText(post.getCurtidas() + " curtidas");
        Picasso.get().load(post.getImagem()).into(viewHolderPost.imageViewPost);
        Picasso.get().load(post.getUsuario().getImagem()).into(viewHolderPost.imageViewPerfil);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolderPost extends RecyclerView.ViewHolder {
        private TextView textViewNome;
        private ImageView imageViewPerfil;
        private ImageView imageViewPost;
        private TextView textViewPostLegenda;
        private TextView textViewPostCurtida;
        private TextView textViewNomeLegenda;

        public ViewHolderPost(@NonNull View itemView) {
            super(itemView);

            textViewNome = itemView.findViewById(R.id.textViewNome1);
            imageViewPerfil = itemView.findViewById(R.id.imageViewPerfil);
            imageViewPost = itemView.findViewById(R.id.imageViewPost);
            textViewPostLegenda = itemView.findViewById(R.id.textViewLegenda);
            textViewPostCurtida = itemView.findViewById(R.id.textView_curtidas);
            textViewNomeLegenda = itemView.findViewById(R.id.textViewNome2);
        }
    }
}
