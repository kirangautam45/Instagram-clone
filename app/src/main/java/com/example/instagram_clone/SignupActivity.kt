package com.example.instagram_clone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SignupActivity : AppCompatActivity() {
    private lateinit var edcoventryid : EditText
    private lateinit var edfname : EditText
    private lateinit var edlname : EditText
    private lateinit var edusername : EditText
    private lateinit var edpassword : EditText
    private lateinit var spinner : Spinner
    private lateinit var btnsignup : Button

    private val batch = arrayOf("batch 25A","batch 25B","batch 25C","batch 25D","batch 25E","batch 25F")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val actionBar = supportActionBar
        actionBar!!.title = "Signup Form"

        edcoventryid = findViewById(R.id.edcoventryid)
        edfname = findViewById(R.id.edfname)
        edlname = findViewById(R.id.edlname)
        edusername = findViewById(R.id.edusername)
        edpassword = findViewById(R.id.edpassword)
        spinner = findViewById(R.id.spinner)
        btnsignup = findViewById(R.id.btnsignip)

        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                batch
        )
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                Toast.makeText(
                        this@SignupActivity, "selected item : $selectedItem", Toast.LENGTH_SHORT
                ).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
                btnsignup.setOnClickListener {
                    var intent = Intent();
                    var user = User(0, edfname.text.toString(), edlname.text.toString(), edusername.text.toString(),
                            edpassword.text.toString());
                    intent.putExtra("tag", user)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
            }
        }