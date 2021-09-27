package com.mindorks.framework.projectandroid
import android.content.SharedPreferences
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var ed1: EditText? = null
    var ed2: EditText? = null
    var ed3: EditText? = null
    var b1: Button? = null
    var sharedpreferences: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed1 = findViewById<View>(R.id.editText) as EditText
        ed2 = findViewById<View>(R.id.editText2) as EditText
        ed3 = findViewById<View>(R.id.editText3) as EditText
        b1 = findViewById<View>(R.id.button) as Button
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE)
        b1!!.setOnClickListener {
            val n = ed1!!.text.toString()
            val ph = ed2!!.text.toString()
            val e = ed3!!.text.toString()

            Toast.makeText(this@MainActivity, "Thanks", Toast.LENGTH_LONG).show()
        }
    }

    companion object {
        const val MyPREFERENCES = "MyPrefs"
        const val Name = "nameKey"
        const val Phone = "phoneKey"
        const val Email = "emailKey"
    }
}
