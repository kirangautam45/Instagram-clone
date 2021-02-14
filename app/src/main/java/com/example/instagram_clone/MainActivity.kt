package com.example.instagram_clone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var lstuser = ArrayList<User>()
    private lateinit var edusername: EditText
    private lateinit var edpassword: EditText
    private lateinit var btnlogin: Button
    private lateinit var tvsignup: TextView

    var username = "admin"
    var password = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edusername = findViewById(R.id.edusername)
        edpassword = findViewById(R.id.edpassword)
        btnlogin = findViewById(R.id.btnlogin)
        tvsignup = findViewById(R.id.tvsignup)

        loadUser()

        btnlogin.setOnClickListener {
            var inputName = edusername.text.toString()
            var inputPassword = edpassword.text.toString()

            val intent= Intent(this,FeedActivity::class.java)

            if (inputName.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(this, "Fields can't be empty..", Toast.LENGTH_SHORT).show()
            } else {
                if (inputName.equals(username) && inputPassword.equals(password))
                    startActivity(intent)
                else {
                    var status = "Log In Fail"
                    Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
                }
            }
        }

        tvsignup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== Activity.RESULT_OK){
            var users = data?.getSerializableExtra("tag") as User
            lstuser.add(users)
        }
    }
    private fun loadUser() {
        lstuser.add(User(0,"admin","admin","admin","admin"))
    }

}