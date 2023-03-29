package com.zubet.recyclerviewgita

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class friendAdapter(private val context: Context, private val  friend: List<friendClass>, val listener: (friendClass) -> Unit)
    : RecyclerView.Adapter<friendAdapter.friendClassViewHolder>(){

    class friendClassViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgFriend = view.findViewById<ImageView>(R.id.img_friend)
        val nameFriend = view.findViewById<TextView>(R.id.tv_item_name)
        val alamatFriend = view.findViewById<TextView>(R.id.tv_item_alamat)
        val ttlFriend = view.findViewById<TextView>(R.id.tv_item_ttl)
        val hobiFriend = view.findViewById<TextView>(R.id.tv_item_hobi)

        fun bindView(friendClass: friendClass, listener: (friendClass) -> Unit){
            imgFriend.setImageResource(friendClass.imgFriend)
            nameFriend.text = friendClass.nameFriend
            alamatFriend.text = friendClass.alamatFriend
            ttlFriend.text = friendClass.ttlFriend
            hobiFriend.text = friendClass.hobiFriend
            itemView.setOnClickListener{
                listener(friendClass)}
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): friendClassViewHolder {
        return friendClassViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kelas,parent,false)
        )
    }

    override fun onBindViewHolder(holder: friendClassViewHolder, position: Int) {
        holder.bindView(friend[position], listener)
    }

    override fun getItemCount(): Int = friend.size
}


