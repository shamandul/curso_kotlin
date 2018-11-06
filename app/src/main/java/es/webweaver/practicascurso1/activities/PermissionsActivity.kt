package es.webweaver.practicascurso1.activities

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.widget.Toolbar
import android.widget.Toast
import es.webweaver.practicascurso1.R
import es.webweaver.practicascurso1.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_permissions.*

class PermissionsActivity : ToolbarActivity() {

    private val requestCameraPermission = 100
    private val requestCameraPicture = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        toolbarToLoad(toolbar as Toolbar)

        buttonPicture.setOnClickListener { getPictureFromCameraAskingPermissions() }
    }

    private fun getPictureFromCamera(){
        //Asegurarnos de que no hay permiso en el manifest
        // Crear intent de captura
        val pictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        //comprobamos que podemos manejar la camara de fotos( Tenemos Camara y app de camara)
        if(pictureIntent.resolveActivity(packageManager) != null){

        }else{
            // No hay activity que puedamanejar lael intent (por ejemplo sin camara)
            startActivityForResult(pictureIntent,requestCameraPicture)
        }
    }

    private fun getPictureFromCameraAskingPermissions(){
        // añadir permiso al manifest
        // comprobar el permiso de la camara
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            // Si no  ha sido  aceptado los permisos (para la API 23 wen adelante
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), 100)
        }else{
            // Si ha sido aceptado anteriormente para todas las versiones
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, requestCameraPicture)
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {

        when(requestCode){
            requestCameraPermission ->{
                if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    //permiso aceptado
                    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    startActivityForResult(intent, requestCameraPicture)
                }else{
                    // Permiso denegado
                    Toast.makeText(this,"You can't take a picture if you don't allow it",Toast.LENGTH_SHORT).show()
                }

            }


        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        when(requestCode){
            requestCameraPicture ->{
                // Comprobar si el resultado es bueno
                if (resultCode== Activity.RESULT_OK){
                    // Obtenemos los extras del intent recibido por parametros
                    val extras = data!!.extras
                    // Formamo el bitmap a partir de los extras
                    val imageBitMap = extras.get("data") as Bitmap
                    // Cargamos las foto como bitmap en el imageView
                    imageViewPicture.setImageBitmap(imageBitMap)
                }else{
                    // la foto no ha sido tomada con exito
                    Toast.makeText(this,"Picture Failed",Toast.LENGTH_SHORT).show()
                }

            }


        }
    }
}
