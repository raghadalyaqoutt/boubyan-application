package org.aisha.applicationboubyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_payment.*


class payment_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setIcon(R.drawable.ic_arrow_back_black_24dp)
//        supportActionBar!!.setIcon(R.drawable.ic_boubyan_logo_og_new)


        btnConfirm.setOnClickListener {
            startActivity(Intent(this,Final_Activity::class.java))

            Toast.makeText(this, "Successfully Transfer", Toast.LENGTH_SHORT).show()
        }

//        val back = toolbarPayment.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
//        toolbarPayment.setNavigationOnClickListener(
//            startActivity(Intent(this, MainActivity::class.java))
//        )

            //            finish()
//        })
//        btnback.setOnClickListener { v: View? -> setContentView(R.layout.activity_main)  }

    }
}
