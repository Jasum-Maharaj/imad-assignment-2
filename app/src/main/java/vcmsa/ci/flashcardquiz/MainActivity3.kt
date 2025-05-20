package vcmsa.ci.flashcardquiz

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val btnExitApp = findViewById<Button>(R.id.btnExitApp)
         btnExitApp.setOnClickListener {
             //exit the application
             finishAffinity()
         }




        }
    }
