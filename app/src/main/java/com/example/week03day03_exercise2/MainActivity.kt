package com.example.week03day03_exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var List:ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectViews()
        prepareListview()

    }
    private fun  connectViews(){List=findViewById(R.id.List)}
    private fun prepareListview(){
        var array:ArrayList<String> = ArrayList()
        array.add("Faisal")
        array.add("Omar")
        array.add("Ali")
        array.add("Fahad")
        array.add("khalid")
        array.add("Mohammed")
        var arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,array)
        List?.adapter=arrayAdapter
        List?.setOnItemClickListener { parent, view, position, id ->
          array.removeAt(position)
            arrayAdapter.notifyDataSetChanged()
        }
    }
}