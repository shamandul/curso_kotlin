package es.webweaver.practicascurso1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast
        //Toast.makeText(this, "hola desde el toast.", Toast.LENGTH_LONG).show()

        // SnackBar

        val layout = findViewById<ConstraintLayout>(R.id.constrain)
        //Snackbar.make(layout, "Hola desde SnacKBar", Snackbar.LENGTH_LONG).show() // tipo 1
        Snackbar.make(layout, "Hola desde SnacKBar", Snackbar.LENGTH_LONG).setAction("Deshacer"){
            Snackbar.make(layout, "Dato restaurado", Snackbar.LENGTH_LONG).show()
        }.show()

    }
}
