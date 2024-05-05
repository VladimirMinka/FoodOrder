package com.example.foodorder


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    private lateinit var btnAuthorizationOrder: Button
    private lateinit var edPhoneNumberOrder: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_order)
        setContentView(R.layout.activity_autorization)
        btnAuthorizationOrder = findViewById<Button>(R.id.btnAuthorization)
        edPhoneNumberOrder = findViewById<EditText>(R.id.edPhoneNumber)
        btnAuthorizationOrder.setOnClickListener {
            SecondActivity.newInstance(this, edPhoneNumberOrder.text.toString())
        }
    }
}