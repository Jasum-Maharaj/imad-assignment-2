package vcmsa.ci.flashcardquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btnViewScore = findViewById<Button>(R.id.btnViewScore)
        btnViewScore.setOnClickListener {
            //go to the next screen
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val btnTerminate = findViewById<Button>(R.id.btnTerminate)
        btnTerminate.setOnClickListener {
            //exit the application
            finishAffinity()
        }

    }
}