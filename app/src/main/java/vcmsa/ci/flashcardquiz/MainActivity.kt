package vcmsa.ci.flashcardquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            //go to the next screen
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnExit.setOnClickListener {
            //exit the application
            finishAffinity()
        }

    }
}