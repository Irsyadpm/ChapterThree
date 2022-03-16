package com.kappa.chapterthree

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    // TODO 1 deklarasi widget
    lateinit var nameEditText: EditText
    lateinit var emailEditText: EditText
    lateinit var addressEditText: EditText
    lateinit var ageEditText: EditText
    lateinit var loginButton: Button

    /** lateinit var usernameEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var loginButton: Button
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /** usernameEditText = findViewById(R.id.username_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
         */
        nameEditText = findViewById(R.id.name_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)
        addressEditText = findViewById(R.id.address_edit_text)
        ageEditText = findViewById(R.id.age_edit_text)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            /**            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
             */
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val address = addressEditText.text.toString().trim()
            val age = ageEditText.text.toString().trim()
//            Toast.makeText(this, "Halo ini toast", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username", username)
//            intent.putExtra("password", password)
//            Log.d("LoginActivity", username)
//            Log.d("LoginActivity", password)

            intent.putExtra("name", "Irsyad")
            intent.putExtra("email", "irsyad@gmail.com")
            intent.putExtra("address", "Harkit")
            intent.putExtra("age", "22")

            val person = PersonParcelable(
                "$name",
                "$email",
                "$address",
                "$age"
            )
            Log.d("LoginActivity", name)
            Log.d("LoginActivity", email)
            Log.d("LoginActivity", address)
            Log.d("LoginActivity", age)

            intent.putExtra("an_object", person)

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {    //untuk mendebug
                Log.e("LoginActivity", e.toString())
                Toast.makeText(this, "Activity not found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
/**
// TODO 2 inisialisasi/casting view/widget
usernameEditText = findViewById(R.id.username_edit_text)
passwordEditText = findViewById(R.id.password_edit_text)
loginButton = findViewById(R.id.login_button)

// TODO 3 action listener pada sebuah button => button melakukan sebuah aksi
loginButton.setOnClickListener {
// TODO 4 lakukan action nya / do something
// Toast.makeText(this,"Halo ini toast", Toast.LENGTH_SHORT).show()
/**
 * paraam 1 adalah activity asal
 * param 2 adalah activity tujuan
*/
val username = usernameEditText.text.toString().trim()
val password = passwordEditText.text.toString().trim()

Log.d("LoginActivity", username)
Log.d("LoginActivity", password)

val intent = Intent(this, MainActivity::class.java)
intent.putExtra("username", username)
intent.putExtra("password", password)
//            intent.putExtra("key", "Fuyyoooohhh")

try {
startActivity(intent)
} catch (e: ActivityNotFoundException) {    //untuk mendebug
Log.e("LoginActivity", e.toString())
Toast.makeText(this, "Activity not found", Toast.LENGTH_SHORT).show()
}
}
} */