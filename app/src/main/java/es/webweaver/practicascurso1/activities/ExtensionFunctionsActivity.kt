package es.webweaver.practicascurso1.activities


import android.os.Bundle
import android.support.v7.widget.Toolbar
import es.webweaver.practicascurso1.MainActivity
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.*
import kotlinx.android.synthetic.main.activity_extension_functions.*
import kotlinx.android.synthetic.main.activity_main.*

class ExtensionFunctionsActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_functions)

        toolbarToLoad(toolbar as Toolbar)

        buttonToast.setOnClickListener { toast("hola") }
        buttonSnackBar.setOnClickListener { snackBar("HOLA", action = "Undo"){toast("undo")}  }
        buttonLoadByUrl.setOnClickListener { imageViewLoadedByUrl.loadByURL("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg") }
        buttonGoToActivity.setOnClickListener { goToActivity<MainActivity>() }
    }
}
