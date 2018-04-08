package com.example.tmp_sda_1180.colorpickerdialog

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tmp_sda_1180.colorpickerdialog.R.id.btn_chooseFavouriteColor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

     val defaultColor: Int = 0


    //val defaultColor:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_chooseFavouriteColor.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ColorPickerDialog::class.java)
            startActivity(intent)
        })


    }

    public override fun onResume() {
        super.onResume()
        // put your code here...
        val bundlefromColorPickerDialog = getIntent()
        var color = bundlefromColorPickerDialog.getIntExtra("keyColor",0)
        //val color = bundlefromColorPickerDialog.getIntExtra("keyColor",0)
        btn_chooseFavouriteColor.setBackgroundColor(color)


    }


}
