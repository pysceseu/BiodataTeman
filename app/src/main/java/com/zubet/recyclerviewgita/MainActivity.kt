package com.zubet.recyclerviewgita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendList = listOf<friendClass>(
            friendClass(
                R.drawable.salma,
                "Salma ' Aziza",
                "lorem ipsum",
                "Pekalongan, 28 Febuari 2006",
                "lorem ipsum"

            ),

            friendClass(
                R.drawable.elfa,
                "Shofiana Elfadda",
                "lorem ipsum",
                "Pekalongan, 12 April 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.rahma,
                "Fatkhiyatur Rahma",
                "lorem ipsum",
                "Pekalongan, 03 Febuari 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.erlin,
                "Erlin Nazila Aprilianti",
                "lorem ipsum",
                "Pekalongan, 15 April 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.vita,
                "Vita Erviana",
                "lorem ipsum",
                "Pekalongan, 22 Juni 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.sari,
                "Efita Sari",
                "lorem ipsum",
                "Pekalongan, 02 Agustus 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.wulan,
                "Nur Wulan Safirti",
                "lorem ipsum",
                "Pekalongan, 12 November 2004",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.jihan,
                "Jihan Rosyidah",
                "lorem ipsum",
                "Pekalongan, 03 November 2006",
                "lorem ipsum"
            ),

            friendClass(
                R.drawable.iffa,
                "Iffa Mufida",
                "lorem ipsum",
                "Pekalongan, 18 Mei 2006",
                "lorem ipsum"
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_friend)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = friendAdapter(this, friendList){

            val intent = Intent(this,DetailFriendActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}