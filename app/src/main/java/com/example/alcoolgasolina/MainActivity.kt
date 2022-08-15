package com.example.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btnCalcular)

        val txtGasolina = findViewById<EditText>(R.id.txtGasolina)
        val txtAlcool = findViewById<EditText>(R.id.txtAlcool)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val precoGasolina = txtGasolina.text.toString().toDouble()
            val precoAlcool = txtAlcool.text.toString().toDouble()

            val resultadoPreco = precoAlcool / precoGasolina
            if ( resultadoPreco <= 0.7) {
                txtResultado.setText("Melhor utilizar Álcool")
            }else {
                txtResultado.setText("Melhor utilizar Gasolina")

            }
        }
    }
}