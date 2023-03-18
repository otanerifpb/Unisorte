package com.example.unisorte


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.unisorte.Uniesco.Cadastro

class MainActivity : AppCompatActivity() {

    private lateinit var etPalavra: EditText
    private lateinit var btCadastro: Button
    private lateinit var btSorteio: Button
    private lateinit var tvResultado: TextView
    private lateinit var cadastro: Cadastro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.cadastro = Cadastro()

        this.etPalavra = findViewById(R.id.etPalavra)
        this.btCadastro = findViewById(R.id.btCadastro)
        this.btSorteio = findViewById(R.id.btSorteio)
        this.tvResultado = findViewById(R.id.tvResultado)

        this.btCadastro.setOnClickListener({cadastrar()})
        this.btSorteio.setOnClickListener({sortear()})

    }

    fun cadastrar(){
        val palavra = this.etPalavra.text.toString()
        this.cadastro.adicionar(palavra)
        this.etPalavra.text.clear()
    }

    fun sortear(){
        val palavra = this.cadastro.sortear()
        if(palavra == null){
            Toast.makeText(this, "Informar uma palavra!!", Toast.LENGTH_LONG).show()
        }else{
            this.tvResultado.text = palavra
        }
    }
}