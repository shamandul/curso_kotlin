package es.webweaver.practicascurso1.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.model.Student
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : ToolbarActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        toolbarToLoad(toolbar as Toolbar)
        enableHomeDisplay(true)

        buttonBack.setOnClickListener { startActivity(Intent(this, IntentsActivity::class.java)) }

        val isExtraSet = setIntentExtrasFromPreviousActivity()

        val isParceableSet =setParcelableExtraFromPreviousActivity()

        if (!isExtraSet && isParceableSet){
            checkBoxDeveloper.visibility = View.INVISIBLE
        }

    }

    private fun setParcelableExtraFromPreviousActivity(): Boolean {
        val student = intent.getParcelableExtra<Student>("student")
        student?.let {

            textViewName.text = student.name
            textViewLastName.text = student.lastName
            textViewAge.text = "${student.age}"
            checkBoxDeveloper.text = "Developer"
            checkBoxDeveloper.isChecked = student.isDeveloper
            return true
        }
        return false
    }

    private fun setIntentExtrasFromPreviousActivity():Boolean {

        val name = intent.getStringExtra("name")
        val lastName = intent.getStringExtra("lastName")
        val age = intent.getIntExtra("age", -1)
        val developer = intent.getBooleanExtra("developer", false)

        if (name!=null && lastName!=null && age>= 0){

            textViewName.text = name
            textViewLastName.text = lastName
            textViewAge.text = "$age"
            checkBoxDeveloper.text = "Developer"
            checkBoxDeveloper.isChecked = developer
            return true
        }
        return false
    }
}
