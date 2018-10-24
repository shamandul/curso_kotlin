package es.webweaver.practicascurso1.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import es.webweaver.practicascurso1.R
import kotlinx.android.synthetic.main.activity_kodlin_android_extensions.*

class KodlinAndroidExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kodlin_android_extensions)

        val btn = findViewById<Button>(R.id.buttonById)
        btn.setOnClickListener { Toast.makeText(this, "Click by ID.", Toast.LENGTH_SHORT).show() }

        buttonByKAT.setOnClickListener { Toast.makeText(this, "Click by KAT.", Toast.LENGTH_SHORT).show()  }
    }
}
