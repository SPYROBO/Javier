package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val email = "alejandrolunaalvarez@gmail.com"
        val pass = "holamundo"
        val emailInput = findViewById<EditText>(R.id.email)
        val passInput = findViewById<EditText>(R.id.pass)
        val btn = findViewById<Button>(R.id.button)
        val resp = findViewById<TextView>(R.id.respuesta)
        btn.setOnClickListener {
            if (email == emailInput.text.toString().trim()){
                if(pass == passInput.text.toString().trim()){
                    resp.text = "Correcto"
                }
            }
            else {
                resp.text = "Credenciales incorrectas"
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}