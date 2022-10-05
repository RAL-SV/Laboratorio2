package com.example.laboratorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.gms.ads.mediation.Adapter

class MainActivity : AppCompatActivity() {

    private lateinit var et_nombre:EditText
    private  lateinit var  et_edad:EditText
    private  lateinit var  et_departamento:EditText
    private  lateinit var tv_Resultado:EditText
    private  lateinit var Lv_Listado:EditText

    val Nombre = arrayListOf<String>()
    val Edad = arrayListOf<String>()
    val Departamento = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        et_nombre = findViewById(R.id.et_nombre)
        et_edad = findViewById(R.id.et_edad)
        et_departamento = findViewById(R.id.et_departamento)
        tv_Resultado = findViewById(R.id.tv_Resultado)
        Lv_Listado = findViewById(R.id.Lv_listado)

    }

    fun  AddPerson () {
        if (!et_nombre.text.toString().isEmpty() && !et_edad.text.toString().isEmpty() && !et_departamento.text.toString().isEmpty()){


        Nombre.add(et_nombre.text.toString())
        Edad.add(et_edad.text.toString())
        Departamento.add(et_departamento.text.toString())



        var adaptador: ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.listado,Nombre)
       Lv_Listado.Adapter


       Lv_listado?.onItemClickListener=object : AdapterView.OnItemClickListener{
                override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    tv_Resultado.setText("Los datos de ${Nombre.get(p2)} la edad es ${Edad.get(p2)} Y recide  en el departamento de ${Departamento.get(p2)}")

        }else{


            Toast.makeText(this,"Campos vacios",Toast.LENGTH_SHORT).show()
        }
    }


}