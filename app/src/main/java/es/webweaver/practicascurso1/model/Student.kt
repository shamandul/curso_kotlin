package es.webweaver.practicascurso1.model

import android.os.Parcel
import android.os.Parcelable

data class Student (var name: String, var lastName: String, var age: Int, var isDeveloper: Boolean = true) :
    Parcelable {
    // Leemos en el mismo orden que declaramos las propiedades
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        // Escribimos los valores en el mismo orden en el que leemos el constructor
        parcel.writeString(name)
        parcel.writeString(lastName)
        parcel.writeInt(age)
        parcel.writeByte(if (isDeveloper) 1 else 0)
    }

    override fun describeContents(): Int {
        // Describe el contenido del objeto
        // 0 siempre se usa el otro es 1 o CONTENTS_FILE_DESCRIPTOR, para tipode objetos que implementan un Fil Descriptor
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        // Esto creará el objeto desde elparcel llamando alaconstructor secundario
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        // Esto Ayudará a serializar arrays de objetos del  mismo tipo que esta clase (Student)
        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}