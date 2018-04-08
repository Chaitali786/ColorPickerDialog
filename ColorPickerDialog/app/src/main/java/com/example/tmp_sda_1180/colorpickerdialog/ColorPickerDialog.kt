package com.example.tmp_sda_1180.colorpickerdialog

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_color_picker_dialog.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.color_picker_dialog.*

class ColorPickerDialog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.color_picker_dialog)

        btnOk.setOnClickListener(View.OnClickListener {


            val intentPassColorToMain = Intent(this, MainActivity::class.java)

            intentPassColorToMain.putExtra("keyColor", cpv_color_picker_view.color)

            btn_tmp.setBackgroundColor(cpv_color_picker_view.color)
            startActivity(intentPassColorToMain)
            finish()



        })

        btnCancle.setOnClickListener(View.OnClickListener { finish() })


    }



}
