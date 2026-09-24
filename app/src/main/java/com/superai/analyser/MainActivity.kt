package com.superai.analyser

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
        }

        val title = TextView(this).apply {
            text = "Super AI Analyser \uD83E\uDDE0"
            textSize = 24f
        }
        
        val input = EditText(this).apply {
            hint = "Yahan number / data / sawaal likho..."
            minLines = 4
        }

        val btn = Button(this).apply {
            text = "ANALYSE NOW"
        }

        val result = TextView(this).apply {
            text = "Result yahan ayega..."
            textSize = 16f
            setPadding(0, 40, 0, 0)
        }

        btn.setOnClickListener {
            val txt = input.text.toString()
            if(txt.isEmpty()){
                result.text = "Pehle kuch likho bhai!"
            } else {
                result.text = "AI Analysis:\n\nTumne likha: $txt\n\nData Type: ${if(txt.toIntOrNull()!=null) "Number" else "Text"}\nLength: ${txt.length} characters\nAI Suggestion: Isko 3 part me samjho aur revise karo.\n\nSuper AI v1.0 - Ready!"
            }
        }

        layout.addView(title)
        layout.addView(input)
        layout.addView(btn)
        layout.addView(result)
        
        setContentView(layout)
    }
}