package com.example.appcartaodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appcartaodevisitas.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val bindingAdd by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingAdd.root)
    }
}