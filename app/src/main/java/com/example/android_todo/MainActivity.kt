package com.example.android_todo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.also {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                it.setTitleTextColor(getColor(R.color.white))
                setSupportActionBar(it) // ツールバーをセット
            }
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.contentFrame, MainFragment.newInstance())
        }.commit()
    }
}