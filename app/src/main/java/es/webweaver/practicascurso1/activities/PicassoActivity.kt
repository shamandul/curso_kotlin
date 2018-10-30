package es.webweaver.practicascurso1.activities

import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.squareup.picasso.Picasso
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_picasso.*

class PicassoActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        toolbarToLoad(toolbar as Toolbar)

        buttonLoader.setOnClickListener { loadImages() }

        //ponemos la imagen en el cache
        Picasso.get().load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg").fetch()

    }

    private fun loadImages(){
        Picasso
                .get()
                .load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg")
                .resize(400,400)
                .centerInside()
                .into(imageViewTop)
        Picasso
                .get()
                .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
                .fit()
                .into(imageViewBottom)

    }
}
