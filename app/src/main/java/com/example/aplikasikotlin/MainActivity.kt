package com.example.aplikasikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_btn(view: View){
        val namaEditText  = findViewById<EditText>(R.id.nama)
        val namaEditText2  = findViewById<EditText>(R.id.alamat)
        val nama = namaEditText.text.toString()
        val alamat= namaEditText2.text.toString()
        val inputnama = ("Nama Anda adalah : ")
        val inputalamat = ("Alamat Anda adalah : ")

        val toast = Toast.makeText(applicationContext, inputnama + nama, Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(applicationContext, inputalamat + alamat, Toast.LENGTH_SHORT)
        toast.show()
        toast2.show()


    }
}