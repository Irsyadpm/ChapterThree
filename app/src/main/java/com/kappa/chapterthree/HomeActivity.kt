package com.kappa.chapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    lateinit var nameTextView: TextView
    lateinit var emailTextView: TextView
    lateinit var addressTextView: TextView
    lateinit var ageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nameTextView = findViewById(R.id.name_text_view)
        emailTextView = findViewById(R.id.email_text_view)
        addressTextView = findViewById(R.id.address_text_view)
        ageTextView = findViewById(R.id.age_text_view)

//        val name = intent.getStringExtra("name")
//        val email = intent.getStringExtra("email")
//        val address = intent.getStringExtra("address")
//        val age = intent.getStringExtra("age")

        val person = intent.getParcelableExtra<PersonParcelable>("object_key")
        Log.d("HomeActivity", person?.name.toString())
        Log.d("HomeActivity", person?.email.toString())
        Log.d("HomeActivity", person?.address.toString())
        Log.d("HomeActivity", person?.age.toString())

        nameTextView.text = person?.name
        emailTextView.text = person?.email
        addressTextView.text = person?.address
        ageTextView.text = person?.age
    }
}