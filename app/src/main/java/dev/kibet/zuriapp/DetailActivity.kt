package dev.kibet.zuriapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.kibet.zuriapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.text = intent.getStringExtra("name")
        binding.tvEmail.text = intent.getStringExtra("email")
        binding.tvCountry.text = intent.getStringExtra("country")
        binding.tvPhone.text = intent.getStringExtra("phone")
        binding.tvTrack.text = intent.getStringExtra("track")


        binding.backBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}