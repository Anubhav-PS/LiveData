package com.anubhavps.livedata

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anubhavps.livedata.databinding.ActivityMainBinding
import com.anubhavps.livedata.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)


        viewModel.counter.observe(this) {
            binding.totalTxt.text = it.toString()
        }

        binding.incrementBtn.setOnClickListener() {
            val num = binding.enterNumberEditTxt.text.toString().toInt()
            viewModel.incrementValue(num)
        }

    }
}