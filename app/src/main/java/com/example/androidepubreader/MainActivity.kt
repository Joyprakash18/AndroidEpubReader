package com.example.androidepubreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidepubreader.epubreader.EpubReader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mReader: EpubReader
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        openBtn.setOnClickListener{
            mReader = EpubReader(this)
            mReader.open("file:///android_asset/Alices_Adventures_in_Wonderland.epub","#32a852");
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mReader.close()
    }
}
