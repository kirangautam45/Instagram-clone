package com.example.instagram_clone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

class PostAdapter(var context: Context, var post: ArrayList<Post>) :
        RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.viewholder_post,parent,false)
        return PostViewHolder(view);
    }


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        Picasso.get().load(post.get(position).image).into(holder.image)
        Picasso.get().load(post.get(position).postimage).into(holder.postimage)
        holder.name?.setText(post.get(position).postname)
    }

    override fun getItemCount(): Int {
        return post.size
    }
}
class PostViewHolder(view: View) :RecyclerView.ViewHolder(view) {
    var image : CircleImageView;
    var name : TextView? = null
    var postimage :ImageView
    init {
        name=view.findViewById(R.id.name)
        postimage=view.findViewById(R.id.postimage)
        image=view.findViewById(R.id.imagei)
    }
}