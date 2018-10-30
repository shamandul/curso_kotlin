package es.webweaver.practicascurso1.activities


import android.os.Bundle
import android.support.v7.widget.Toolbar
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class ExtensionFunctionsActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_functions)

        toolbarToLoad(toolbar as Toolbar)
    }
}
