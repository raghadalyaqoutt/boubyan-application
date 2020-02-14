package org.aisha.applicationboubyan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        btnLogin.setOnClickListener {
            if(username.text.toString().equals("admin")
                && password.text.toString().equals("123")){

                Toast.makeText(this, "Logging in successfully", Toast.LENGTH_SHORT).show()

                startActivity(Intent( this, MainActivity::class.java))
            }
            else{

                Toast.makeText(this, "Failed to login", Toast.LENGTH_SHORT).show()
            }



        }

}
}