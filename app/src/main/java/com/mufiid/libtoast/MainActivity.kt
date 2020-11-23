package com.mufiid.libtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mufiid.lib.Toaster
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        btn_toast_success.setOnClickListener(this)
        btn_toast_info.setOnClickListener(this)
        btn_toast_warning.setOnClickListener(this)
        btn_toast_danger.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_toast_success -> Toaster.success(this, "Terima Kasih", Toast.LENGTH_SHORT).show()
            R.id.btn_toast_info ->  Toaster.info(this, "Pemberitahuan!!", Toast.LENGTH_SHORT).show()
            R.id.btn_toast_warning -> Toaster.warning(this, "Mohon Maaf!", Toast.LENGTH_SHORT).show()
            R.id.btn_toast_danger -> Toaster.danger(this, "Peringatan!!", Toast.LENGTH_SHORT).show()
        }
    }
}