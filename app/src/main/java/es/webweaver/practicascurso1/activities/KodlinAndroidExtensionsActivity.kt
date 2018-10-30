package es.webweaver.practicascurso1.activities

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.Toast
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_kodlin_android_extensions.*
import kotlinx.android.synthetic.main.activity_main.*

class KodlinAndroidExtensionsActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kodlin_android_extensions)

        toolbarToLoad(toolbar as Toolbar)

        val btn = findViewById<Button>(R.id.buttonById)
        btn.setOnClickListener { Toast.makeText(this, "Click by ID.", Toast.LENGTH_SHORT).show() }

        buttonByKAT.setOnClickListener { Toast.makeText(this, "Click by KAT.", Toast.LENGTH_SHORT).show()  }
    }
}
