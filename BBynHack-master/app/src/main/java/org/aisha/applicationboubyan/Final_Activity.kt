package org.aisha.applicationboubyan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_payment.*

class Final_Activity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_payment)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setIcon(R.drawable.ic_arrow_back_black_24dp)


        btnConfirm2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
       }

    }
}