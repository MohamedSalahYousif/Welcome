package com.get.welcome
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.get.welcome.ui.theme.WelcomeTheme
import com.google.android.material.textfield.TextInputEditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val button7 :Button=findViewById(R.id.button55)
        val amounted:EditText=findViewById(R.id.editTextText)
        val resulted:EditText=findViewById(R.id.editTextText2)

        button7.setOnClickListener()
        {

            val amount = amounted.text.toString().toDouble()
            val result = amount.times(32)

            resulted.setText(result.toString())

        }
        val button2 = findViewById<Button>(R.id.button_2)
        button2.setOnClickListener {
        startActivity(Intent(this, MainActivity2::class.java))
        }

    }

}