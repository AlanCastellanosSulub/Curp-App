package com.example.curp_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var res = findViewById<TextView>(R.id.textViewR);
    var Name = findViewById<EditText>(R.id.editTextNom);
    var Pat = findViewById<EditText>(R.id.editTextApeP);
    var Mat = findViewById<EditText>(R.id.editTextApeM);
    var Date = findViewById<EditText>(R.id.editTextF);
    var Estate = findViewById<EditText>(R.id.editTextE);
    var Genero=findViewById<EditText>(R.id.editTextG)
    //var Clean=findViewById<Button>(R.id.button)
    //var Generar = findViewById<Button>(R.id.button2);

    val nombre = Name.text.toString()
    val paterno = Pat.text.toString()
    val materno = Mat.text.toString()
    val date = Date.text.toString()
    val estado=Estate.text.toString()
    val gene=Genero.text.toString()

    val homoclave: MutableList<String> = mutableListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    val homoclave2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    fun onClick2(v:View?){
        button2.setOnClickListener {

            var CNombre = nombre[0].toString()
            var CPaterno = paterno[0].toString()
            var CPaterno2 = paterno[1].toString()
            var CMaterno = materno[0].toString()
            var CDate = date[3].toString()
            var CDate2 = date[4].toString()
            var CDate3=date[6].toString()
            var CDate4=date[7].toString()
            var CDate5=date[9].toString()
            var CDate6=date[10].toString()
            var CGen= gene;
            var CEs=estado.toString()

            for (num in paterno){
                println(num)
            }

            var CNombre2 = nombre[3].toString()
            var CPaterno3 = paterno[3].toString()
            var CMaterno3 = paterno[3].toString()
            var Cclave = homoclave.random()
            var Cclave2 = homoclave2.random()




        }
    }

     fun onClick(v: View?) {
        button.setOnClickListener {
            editTextNom.setText("")
            editTextApeP.setText("")
            editTextApeM.setText("")
            editTextE.setText("")
            editTextF.setText("")
            editTextG.setText("")
            textViewR.text = ""
        }
    }
}