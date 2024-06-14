package com.example.lojavirtual.comuns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.lojavirtual.R
import com.example.lojavirtual.database.MyDatabase

class LoginActivity : AppCompatActivity() {

    private val db: MyDatabase = MyDatabase.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var resp : Boolean
        val edtEmailLoginActivity: EditText = findViewById(R.id.edt_email)
        val edtPassLoginActivity: EditText = findViewById(R.id.edt_pass)
        val button: Button = findViewById(R.id.button)
//
        val email = intent.getStringExtra("register_email").toString()
        val pass = intent.getStringExtra("register_pass")

        insertDataInEditTexts(editText = edtEmailLoginActivity, otherEditText = edtPassLoginActivity, email = email!!, pass = pass!!)

        button.setOnClickListener {
            if (edtEmailLoginActivity.text.isEmpty() || edtEmailLoginActivity.text.isBlank()
                || edtPassLoginActivity.text.isEmpty() || edtPassLoginActivity.text.isBlank()) {

                Toast.makeText(this, "Por favor insira seu email e senha", Toast.LENGTH_SHORT).show()
            } else {
                resp = db.loginValidate(email, pass)
                if(resp){
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else Toast.makeText(this, "Login Inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun insertDataInEditTexts(editText: EditText, otherEditText: EditText, email: String, pass: String) {
        editText.setText(email)
        otherEditText.setText(pass)
    }
}