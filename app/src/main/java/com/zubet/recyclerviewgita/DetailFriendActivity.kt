package com.zubet.recyclerviewgita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailFriendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_friend)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val friend = intent.getParcelableExtra<friendClass>(MainActivity.INTENT_PARCELABLE)

        val imgFriend = findViewById<ImageView>(R.id.img_item_photo)
        val nameFriend = findViewById<TextView>(R.id.tv_item_name)
        val alamatFriend = findViewById<TextView>(R.id.tv_item_alamat)
        val ttlFriend = findViewById<TextView>(R.id.tv_item_ttl)
        val hobiFriend = findViewById<TextView>(R.id.tv_item_hobi)

        imgFriend.setImageResource(friend?.imgFriend!!)
        nameFriend.text = friend.nameFriend
        alamatFriend.text = friend.alamatFriend
        ttlFriend.text = friend.ttlFriend
        hobiFriend.text = friend.hobiFriend

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}