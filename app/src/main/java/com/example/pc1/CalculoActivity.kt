package com.example.pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CalculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val etParcial: EditText = findViewById(R.id.etParcial)
        val etFinal: EditText = findViewById(R.id.etFinal)
        val etPEP: EditText = findViewById(R.id.etPEP)
        val btnSend: Button = findViewById(R.id.btnSend)
        btnSend.setOnClickListener{
                this.sendMessage()
            }

    }

    private fun sendMessage(message: Int)
    {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra()
        startActivity(intent)
    }

}