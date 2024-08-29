package hhhcom.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Find the views using the correct types
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)


        val txtInput1 = findViewById<TextInputEditText>(R.id.inputText1)
        val txtInput2 = findViewById<TextInputEditText>(R.id.inputText2)
        val textView = findViewById<TextView>(R.id.result)

        // Handle the button click
        btnPlus.setOnClickListener {
            val input1 = txtInput1.text.toString().toIntOrNull() ?: 0
            val input2 = txtInput2.text.toString().toIntOrNull() ?: 0
            textView.text = (input1 + input2).toString()
            println(textView)
        }

        btnMinus.setOnClickListener{
            val input1 = txtInput1.text.toString().toIntOrNull()?:0
            val input2 = txtInput2.text.toString().toIntOrNull()?:0
            textView.text = (input1 - input2).toString()
            println(textView)
        }


        btnMul.setOnClickListener{
            val input1 = txtInput1.text.toString().toIntOrNull()?:0
            val input2 = txtInput2.text.toString().toIntOrNull()?:0
            textView.text = (input1 * input2).toString()
            println(textView)
        }

        btnDiv.setOnClickListener{
            val input1 = txtInput1.text.toString().toIntOrNull()?:0
            val input2 = txtInput2.text.toString().toIntOrNull()?:0

            if (input1 == 0){
                println("cannot divided by 0")
            }else{

            textView.text = (input1 / input2).toString()
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


