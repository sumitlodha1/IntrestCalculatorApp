package com.itsxlord.intrestcalculator

import android.graphics.Color
import android.icu.text.NumberFormat
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.concurrent.thread
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private fun closeKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        actionBar?.hide()
        Thread.sleep(1000)
        installSplashScreen()


        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val principal = findViewById<EditText>(R.id.principalAmount)
        val intrestRate = findViewById<EditText>(R.id.intrestRate)
        val timePeriod = findViewById<EditText>(R.id.timePeriod)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val result = findViewById<TextView>(R.id.result)

        val btnSI = findViewById<RadioButton>(R.id.simpleintrest)
        val btnClear = findViewById<Button>(R.id.btnclear)
        val btnRadioGrp = findViewById<RadioGroup>(R.id.radioBtnGrp)

        val specialcase = findViewById<ImageButton>(R.id.specialbtn)

        btnSubmit.setOnClickListener {

            closeKeyboard()
            var p = principal.text.toString().toDoubleOrNull()
            var r = intrestRate.text.toString().toDoubleOrNull()
            var t = timePeriod.text.toString().toIntOrNull()
            var total = 0.0
            if (p === null || r=== null || t === null){

                    if (p == null) {
                        principal.setText("Enter Value.......")

                    }
                    if (r == null) {
                        intrestRate.setText("Enter Value.......")
                    }
                    if (t == null)  {
                        timePeriod.setText("Enter Value.......")
                    }



            }
            else {
                if (btnSI.isChecked) {

                    var si = (p * r * t) / 100
                    total = p + si

                } else {
                    r = r / 100
                    var ci = p * (1 + r).pow(t)
                    total = p + ci

                }
                result.text = NumberFormat.getCurrencyInstance().format(total)
            }

        }


        btnClear.setOnClickListener {
            principal.text.clear()
            intrestRate.text.clear()
            timePeriod.text.clear()
            result.text = ""
        }

        btnRadioGrp.setOnCheckedChangeListener { group, checkedId ->
            result.text = ""
        }




    }
}