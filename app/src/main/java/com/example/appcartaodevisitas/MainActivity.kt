package com.example.appcartaodevisitas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appcartaodevisitas.databinding.ActivityMainBinding
import com.example.appcartaodevisitas.ui.AddBusinessCardActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAddCard.setOnClickListener {
           val addIntent = Intent(this, AddBusinessCardActivity::class.java)
            startActivity(addIntent)
        }

    }




}

