package com.example.imprimirdatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elCheckBox = findViewById<CheckBox>(R.id.checkBox)
        val elCheckBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val elRadioButton = findViewById<RadioButton>(R.id.radio1)
        val elRadioButton2 = findViewById<RadioButton>(R.id.radio2)
        val elSmitch = findViewById<Switch>(R.id.switch1)
        val eltoggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val elButton = findViewById<Button>(R.id.button)


        elButton.setOnClickListener {
            val message = StringBuilder()

            val Numbert : EditText= findViewById(R.id.editTextNumber)
            val Number = Numbert.text.toString()
            message.append("$Number \n")


            if (elRadioButton.isChecked && elRadioButton2.isChecked) {
                message.append("Radio 1 y Radio 2 estan selecionados. \n")
            } else if (elRadioButton.isChecked) {
                message.append("el radio 1 esta selecionados. \n")
            } else if (elRadioButton2.isChecked) {
                message.append("el Radio 2 esta selecionado. \n")
            } else {
                message.append("No hay Radios selecionados. \n")
            }

            if (elCheckBox.isChecked && elCheckBox2.isChecked) {
                message.append("CheckBox 1 y CheckBox 2 estan selecionados. \n")
            } else if (elCheckBox.isChecked) {
                message.append("el CheckBox 1 esta selecionados. \n")
            } else if (elCheckBox2.isChecked) {
                message.append("el CheckBox 2 esta selecionado. \n")
            } else {
                message.append("No hay CheckBox selecionados. \n")
            }


            if (eltoggleButton.isChecked) {
                message.append("ToggleButton seleccionado. \n")
            } else {
                message.append("el ToggleButton no esta seleccionado. \n")
            }

            if (elSmitch.isChecked) {
                message.append("Switch selecionado. \n")
            } else {
                message.append("Switch no esta selecionado. \n")
            }
            Toast.makeText(this, message.toString(), Toast.LENGTH_LONG).show()


        }
    }
}