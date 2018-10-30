package es.webweaver.practicascurso1.model

import android.support.v7.widget.Toolbar

interface IToolbar {
    fun toolbarToLoad(toolbar: Toolbar)
    fun enableHomeDisplay(value: Boolean)
}