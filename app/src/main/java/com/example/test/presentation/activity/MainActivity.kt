package com.example.test.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.data.sources.base.Const
import com.example.test.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.usernameTextView.text = Const.USERNAME
    }
}