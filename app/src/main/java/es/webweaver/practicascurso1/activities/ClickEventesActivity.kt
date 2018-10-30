package es.webweaver.practicascurso1.activities


import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.Toast
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class ClickEventesActivity : ToolbarActivity(), View.OnLongClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_eventes)

        toolbarToLoad(toolbar as Toolbar)

        clickInLine()

        val btn1 = findViewById<Button>(R.id.buttonClickMulti)
        val btn2 = findViewById<Button>(R.id.buttonClickMulti1)
        val btn3 = findViewById<Button>(R.id.buttonClickMulti2)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)
    }

    /*
     * Método tiene que ser publico
     * Los nombre tienen que coincidir
     * Y Recibe un sólo parámetro (View)
     */
    fun xmlClick(view :View){
        Toast.makeText(this, "Click By XML", Toast.LENGTH_SHORT).show()
    }

    private fun clickInLine(){
        val btn = findViewById<Button>(R.id.buttonClickInLine)
        btn.setOnClickListener { Toast.makeText(this, "Click in Line", Toast.LENGTH_SHORT).show() }
    }

    override fun onLongClick(view: View): Boolean {
       when(view.id){
           R.id.buttonClickMulti -> Toast.makeText(this, "Click Multi 1", Toast.LENGTH_SHORT).show()
           R.id.buttonClickMulti1 -> Toast.makeText(this, "Click Multi 2", Toast.LENGTH_SHORT).show()
           R.id.buttonClickMulti2 -> Toast.makeText(this, "Click Multi 3", Toast.LENGTH_SHORT).show()
       }
        return true
    }


}
