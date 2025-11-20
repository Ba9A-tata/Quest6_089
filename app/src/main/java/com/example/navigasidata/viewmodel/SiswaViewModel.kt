package com.example.navigasidata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasidata.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow

class SiswaViewModel : ViewModel() {
    private  val _statusUi = MutableStateFlow(Siswa())

}