package es.webweaver.practicascurso1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.Toast
import es.webweaver.practicascurso1.activities.*
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ToolbarActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarToLoad(toolbar as Toolbar)

        val btnLifeCycle = findViewById<Button>(R.id.button_to_cycle)
        val btnClickEventes = findViewById<Button>(R.id.button_to_click)
        val btnAndroidExt = findViewById<Button>(R.id.button_to_android_extensions)
        val btnPicasso = findViewById<Button>(R.id.button_to_picasso)
        val btnListView = findViewById<Button>(R.id.button_to_list_view)
        val btnIntents = findViewById<Button>(R.id.button_to_intents)
        val btnPermission = findViewById<Button>(R.id.button_to_permissions)
        val btnSharedPreferences = findViewById<Button>(R.id.button_to_shared_preferences)
        val btnExtensionFunctions = findViewById<Button>(R.id.button_to_extension_functions)

        btnLifeCycle.setOnClickListener { goToLifeCycleActivity() }
        btnClickEventes.setOnClickListener { goToClickEventsActivity() }
        btnAndroidExt.setOnClickListener { goToKootlinAndroidExteActivity() }
        btnPicasso.setOnClickListener { goToPicassoActivity() }
        btnListView.setOnClickListener { goToListViewActivity() }
        btnIntents.setOnClickListener { goToIntentsActivity() }
        btnPermission.setOnClickListener { goToPermissionsActivity() }
        btnSharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btnExtensionFunctions.setOnClickListener { goToExtensionFunctionsActivity() }

    }

    private fun snackBar() {
        val layout = findViewById<ConstraintLayout>(R.id.constrain)
        //Snackbar.make(layout, "Hola desde SnacKBar", Snackbar.LENGTH_LONG).show() // tipo 1
        Snackbar.make(layout, "Hola desde SnacKBar", Snackbar.LENGTH_LONG).setAction("Deshacer") {
            Snackbar.make(layout, "Dato restaurado", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    private fun toast() {
        Toast.makeText(this, "hola desde el toast.", Toast.LENGTH_LONG).show()
    }

    private fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))
    private fun goToClickEventsActivity() = startActivity(Intent(this, ClickEventesActivity::class.java))
    private fun goToKootlinAndroidExteActivity() = startActivity(Intent(this, KodlinAndroidExtensionsActivity::class.java))
    private fun goToPicassoActivity() = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentsActivity() = startActivity(Intent(this, IntentsActivity::class.java))
    private fun goToPermissionsActivity() = startActivity(Intent(this, PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity() = startActivity(Intent(this, SharedPreferencesActivity::class.java))
    private fun goToExtensionFunctionsActivity() = startActivity(Intent(this, ExtensionFunctionsActivity::class.java))

}
