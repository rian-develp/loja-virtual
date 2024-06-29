package com.example.lojavirtual.comuns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.lojavirtual.R
import com.example.lojavirtual.database.MyDatabase

class RegisterActivity : AppCompatActivity() {

    private val database = MyDatabase.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val edtEmail: EditText = findViewById(R.id.register_edt_email)
        val edtPass: EditText = findViewById(R.id.register_edt_pass)
        val button: Button = findViewById(R.id.register_button)

        button.setOnClickListener {
            if (edtEmail.text.isEmpty() || edtEmail.text.isBlank() || edtPass.text.isEmpty() || edtPass.text.isBlank()) {
                Toast.makeText(this, "Por favor insira seu email e senha", Toast.LENGTH_SHORT).show()
            } else {
                val email: String = edtEmail.text.toString().trim()
                val pass: String = edtPass.text.toString().trim()
                database.saveDataUser(data = email, data2 = pass)
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("register_email", email)
                intent.putExtra("register_pass", pass)
                startActivity(intent)
            }
        }
    }
}