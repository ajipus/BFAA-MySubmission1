package com.dicoding.picodiploma.mysubmission1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    companion object {
        const val DATA = "user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgAvatar: ImageView = findViewById(R.id.img_item_avatar)
        val tvUsername: TextView = findViewById(R.id.tv_item_username)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvLocation: TextView = findViewById(R.id.tv_item_location)
        val tvRepository: TextView = findViewById(R.id.tv_item_repository)
        val tvCompany: TextView = findViewById(R.id.tv_item_company)
        val tvFollowers: TextView = findViewById(R.id.tv_item_followers)
        val tvFollowing: TextView = findViewById(R.id.tv_item_following)

        val user = intent.getParcelableExtra<User>(DATA)
        Toast.makeText(this, "Kamu memilih " + user?.name, Toast.LENGTH_SHORT).show()

        if(user!=null){
            imgAvatar.setImageResource(user.avatar)
            tvUsername.text = user.username
            tvName.text = user.name
            tvLocation.text = user.location
            tvRepository.text = user.repository
            tvCompany.text = user.company
            tvFollowers.text = user.followers
            tvFollowing.text = user.following
        }

    }


}