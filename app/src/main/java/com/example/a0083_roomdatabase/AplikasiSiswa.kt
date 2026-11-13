package com.example.a0083_roomdatabase


import android.app.Application
import com.example.a0083_roomdatabase.repositori.ContainerApp
import com.example.a0083_roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}