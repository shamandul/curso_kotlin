package es.webweaver.practicascurso1.activities


import android.os.Bundle
import es.webweaver.practicascurso1.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}
