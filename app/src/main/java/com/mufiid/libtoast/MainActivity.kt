package com.mufiid.libtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mufiid.lib.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toaster.info(this, "Info", Toast.LENGTH_SHORT).show()
//        Toaster.success(this, "Success", Toast.LENGTH_SHORT).show()
//        Toaster.warning(this, "Warning", Toast.LENGTH_SHORT).show()
        Toaster.danger(this, "Danger", Toast.LENGTH_SHORT).show()
    }
}