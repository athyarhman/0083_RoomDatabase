package com.example.a0083_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a0083_roomdatabase.AplikasiSiswa
import kotlin.text.get

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            _root_ide_package_.com.example.a0083_roomdatabase.viewmodel.HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            _root_ide_package_.com.example.a0083_roomdatabase.viewmodel.EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari
 * [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa():AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)