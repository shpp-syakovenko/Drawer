package com.serglife.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.serglife.drawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.open.setOnClickListener {
            binding.drawer.openDrawer(GravityCompat.START)
        }

        binding.navView.setNavigationItemSelectedListener { item ->

            when(item.itemId){
                R.id.cat_1_1 -> Toast.makeText(this, "Cat 1_1", Toast.LENGTH_SHORT).show()
                R.id.cat_1_2 -> Toast.makeText(this, "Cat 1_2", Toast.LENGTH_SHORT).show()
                R.id.cat_1_3 -> Toast.makeText(this, "Cat 1_3", Toast.LENGTH_SHORT).show()
                R.id.cat_2_1 -> Toast.makeText(this, "Cat 2_1", Toast.LENGTH_SHORT).show()
                R.id.cat_2_2 -> Toast.makeText(this, "Cat 2_2", Toast.LENGTH_SHORT).show()
                R.id.cat_2_3 -> Toast.makeText(this, "Cat 2_3", Toast.LENGTH_SHORT).show()
            }

            binding.drawer.closeDrawer(GravityCompat.START)
            true
        }
    }

    fun headerOnClick(view: View) {
        Toast.makeText(this, "Click header!!!", Toast.LENGTH_SHORT).show()
    }
}