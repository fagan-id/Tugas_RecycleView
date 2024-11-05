package com.example.tugas_recycleview

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val PictureAdapter = PictureAdapter(generateDataDummy()){
            picture ->
            Toast.makeText(this@MainActivity, "You Click On ${picture.nameImage}", Toast.LENGTH_SHORT).show()
        }
        with(binding){
            rvImage.apply {
                adapter = PictureAdapter
                layoutManager = GridLayoutManager(this@MainActivity,3)
            }
        }
    }

    fun generateDataDummy(): List<Picture> {
        return listOf(
            Picture(nameImage = "1"),
            Picture(nameImage = "2"),
            Picture(nameImage = "3"),
            Picture(nameImage = "4"),
            Picture(nameImage = "5"),
            Picture(nameImage = "6"),
        )
    }
}