package dev.kibet.zuriapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.kibet.zuriapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var names: String
    private lateinit var emails: String
    private lateinit var phones: String
    private lateinit var countrys: String
    private lateinit var tracks: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //if (name.isNullOrEmpty()) return@setOnClickListener

            names = binding.enterName.text.toString()
            emails = binding.enterEmail.text.toString()
            phones = binding.enterPhone.text.toString()
            countrys = binding.enterCountry.text.toString()
            tracks = binding.enterTrack.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", names)
            intent.putExtra("email",emails)
            intent.putExtra("track",tracks)
            intent.putExtra("phone",phones)
            intent.putExtra("country",countrys)

            startActivity(intent)
        }
    }
}