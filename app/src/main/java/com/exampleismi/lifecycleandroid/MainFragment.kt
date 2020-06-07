package com.exampleismi.lifecycleandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_main, container,
        false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState) //dipanggil ketika fragment sudah dipanggil
        //dan kita ingin menginisialisasi salah satu di dalam fragment variabel yang ada
    }

    override fun onDestroyView() {
        super.onDestroyView() //dipanggil ketika activity yang telah dibuka, ditutup kembali
    }
}