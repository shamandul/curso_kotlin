package es.webweaver.practicascurso1.activities

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Toast
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.app.preferences
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shared_preferences.*

class SharedPreferencesActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        toolbarToLoad(toolbar as Toolbar)
        buttonSave.setOnClickListener { setValuesSharedPreferences(); cleanEditTexts(); getValuesSharedPreferences() }
        getValuesSharedPreferences()

    }

    private fun getValuesSharedPreferences(){
        if (preferences.name.isNotEmpty() && preferences.age >= 0){
            textViewSharedPreferences.text = "Wellcome ${preferences.name}, your age is ${preferences.age}"
        } else {
            textViewSharedPreferences.text = "Wellcome. Please seve your nema an your age"
        }
    }

    private fun setValuesSharedPreferences(){
        if (editTextName.text.toString().isNotEmpty() && editTextAge.text.toString().isNotEmpty()){
            preferences.name = editTextName.text.toString()
            preferences.age = editTextAge.text.toString().toInt()

            Toast.makeText(this,"Values have been saved successfully",Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this,"Please fill the name and the ege before saving",Toast.LENGTH_SHORT).show()
        }
    }
    private fun cleanEditTexts(){
        editTextName.text.clear()
        editTextAge.setText("")
    }
}
