package es.webweaver.practicascurso1.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.model.Student
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_intents.*
import kotlinx.android.synthetic.main.activity_main.*

class IntentsActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        toolbarToLoad(toolbar as Toolbar)

        buttonIntentExtras.setOnClickListener { goIntentExtras() }
        buttonIntentFlags.setOnClickListener { goIntentFlags() }
        buttonIntentObject.setOnClickListener { goIntentObject() }

    }

    private fun goIntentExtras(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.putExtra("name", "Jesus")
        intent.putExtra("lastName", "Serdio")
        intent.putExtra("age", 41)
        intent.putExtra("developer", true)



        startActivity(intent)
    }

    private fun goIntentFlags(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY // No guarda el activity en el Stack
      //  intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION // No animación
      //  intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK // Borra el Stack completo

        startActivity(intent)
        //finish() // Destruye la activity en el Stack
    }

    private fun goIntentObject(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        val student = Student("Jesús", "de Serdio", 41 , false)
        intent.putExtra("student", student)
        startActivity(intent)
    }

}
