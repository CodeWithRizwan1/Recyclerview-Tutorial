package com.dev.recyclerviewtutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Display.Mode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.recyclerviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val contryLIst = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.mainRecyclerview.adapter = MainAdapter(contryLIst)
        binding.mainRecyclerview.layoutManager = LinearLayoutManager(this)

        contryLIst.add(Model(R.drawable.flag,"Pakistan"))
        contryLIst.add(Model(R.drawable.america,"America"))
        contryLIst.add(Model(R.drawable.indonesia,"Indonecia"))
        contryLIst.add(Model(R.drawable.china,"China"))



    }
}