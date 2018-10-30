package es.webweaver.practicascurso1.activities


import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.LifeCycleEventsActivity

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnable = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    // boton atrás personalizado
    override fun onBackPressed() {
        //super.onBackPressed()
        if (exitEnable){
            super.onBackPressed()
        }
        exitEnable = true
        Toast.makeText(this,"Pulsa atrás para salir de la ventana", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { exitEnable = false }, 2000)
    }
}
