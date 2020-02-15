package org.aisha.applicationboubyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setTitle("Bank Boubyan")
        supportActionBar!!.setIcon(getDrawable(R.drawable.ic_logo_bank))



        btnPay2.setOnClickListener {
            startActivity(Intent(this, payment_Activity::class.java))
//                moneyy.text = "190.000"
                    }



//    fun set(v :View) {
//        val hatha = findViewById<EditText>(R.id.moneyy)
//
//    }
   //     btnback.setOnClickListener { v: View? ->  setContentView(R.layout.activity_main)}


//        toolbarTransfer.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
//
//        toolbarTransfer.setNavigationOnClickListener(View.OnClickListener {
//            finish()
//        })

//
//        var queue = Volley.newRequestQueue(this)
//
//        var url =""
//
//
//        var listOFData= ArrayList<payments>()
//
//        var userRequest =
//            StringRequest(Request.Method.GET, url, Response.Listener<String> { response ->
//                //response code is here
//                var Article = Gson().fromJson<ArrayList<payments>>(response, object: TypeToken<ArrayList<payments>>(){}.type)
////                            Toast.makeText(this, Article[1].title, Toast.LENGTH_LONG).show()
//
//                listOFData.add(payments("Zain","20.000KWD","imgStr"))
//
//               // listViewPayments.adapter= AdapterPayments(listOFData,this)
//
//            }, Response.ErrorListener {
//                fun onErrorResponse(error:VerifyError?){
//                    println(error)
//                }
//            })
//        queue?.add(userRequest)


    }

}
