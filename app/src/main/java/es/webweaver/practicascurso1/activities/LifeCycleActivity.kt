package es.webweaver.practicascurso1.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import es.webweaver.practicascurso1.R

class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}
