package com.example.firstapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChangeColorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "CAMBIA EL COLOR DEL TEXTO"
    }
    val text: LiveData<String> = _text
}