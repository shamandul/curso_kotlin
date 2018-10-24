package es.webweaver.practicascurso1.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.adapters.PersonAdapter
import es.webweaver.practicascurso1.model.Person
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    private  lateinit var adapter: PersonAdapter
    private  lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        personList = getPersons()
        adapter = PersonAdapter(this, R.layout.list_view_person, personList)

        listView.adapter = adapter

    }
    private fun getPersons():List<Person>{
        return listOf<Person>(
            Person("Jesús", "de Serdio", 41),
            Person("Juan Diego", "López", 7 ),
            Person("Miriam", "López", 3),
            Person("Adriana", "Varela", 4),
            Person("Alba", "Varela", 1),
            Person("Angel", "Varela", 3),
            Person("Paco", "Pérez", 30),
            Person("Daniela", "de Serdio", 5),
            Person("María", "Gil", 29),
            Person("Marcos", "Rodríguez", 25)
        )
    }
}
