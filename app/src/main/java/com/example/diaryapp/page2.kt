package com.example.diaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
    }

    fun showtoastblush(view: View) {
        Toast.makeText(this, "Hmmm, seems like you had a good day!", Toast.LENGTH_SHORT).show()
    }
    fun showtoastangry(view: View) {
        Toast.makeText(this, "Anger is one letter short of danger", Toast.LENGTH_SHORT).show()
    }
    fun showtoastsad(view: View) {
        Toast.makeText(this, "It's OK to not feel OK", Toast.LENGTH_SHORT).show()
    }
    fun showtoasthappy(view: View) {
        Toast.makeText(this, "I am happy if you are happy", Toast.LENGTH_SHORT).show()
    }
}