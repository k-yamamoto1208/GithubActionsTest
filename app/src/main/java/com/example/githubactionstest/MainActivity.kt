package com.example.githubactionstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val aiueo = "こんにちは" as String

        Log.d("メモ", aiueo)

        when(aiueo) {
            is String -> println("aaa")
            else ->
        }
    }
}