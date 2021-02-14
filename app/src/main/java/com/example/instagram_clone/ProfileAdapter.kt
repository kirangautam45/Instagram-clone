package com.example.instagram_clone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

class ProfileAdapter(var context: Context, var profiles: ArrayList<Profile>) :
    RecyclerView.Adapter<ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.viewholder_profile,parent,false)
        return ProfileViewHolder(view);
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
//        Glide.with(context).load(profiles.get(position).image).into(holder.image)
        Picasso.get().load(profiles.get(position).image).into(holder.image)
        holder.name.setText(profiles.get(position).name)
    }
    override fun getItemCount(): Int {
        return profiles.size
    }
}
class ProfileViewHolder(view: View) :RecyclerView.ViewHolder(view) {
    var image : CircleImageView;
    var name : TextView;
    init {
        image = view.findViewById(R.id.image)
        name = view.findViewById(R.id.name)
    }
}
