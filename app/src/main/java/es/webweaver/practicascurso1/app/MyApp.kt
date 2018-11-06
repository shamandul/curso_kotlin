package es.webweaver.practicascurso1.app

import android.app.Application
import es.webweaver.practicascurso1.others.MySharedPreferences

val preferences: MySharedPreferences by lazy { MyApp.prefs!! }

class MyApp: Application(){
    // necesitamos decir al manifest con android:name=".app.MyApp"

    companion object {
        var prefs: MySharedPreferences? = null
    }

    override fun onCreate() {
        super.onCreate()
        prefs = MySharedPreferences(applicationContext)
    }

}