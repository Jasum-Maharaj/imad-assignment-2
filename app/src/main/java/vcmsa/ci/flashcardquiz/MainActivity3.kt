package vcmsa.ci.flashcardquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        //find the buttons and textviews by their ID
        val txtDisplayScore = findViewById<TextView>(R.id.txtDisplayScore)
        val txtReview = findViewById<TextView>(R.id.textView)
        val btnReviewMyAnswers = findViewById<Button>(R.id.btnReviewMyAnswers)


        val score = intent.getIntExtra("score", 0)
        //check the score and display the appropriate message
        if (score >= 4 && score < 6) {
             txtDisplayScore.text = "Your score is $score /5. Well done!"
        } else if (score >1 && score < 4) {
            txtDisplayScore.text = "Your score is $score /5. You can do better!"
        } else {
            txtDisplayScore.text = "Your score is $score /5. You need to work harder!"
        }
        //btnReviewMyAnswers will display the answers to all the questions
        btnReviewMyAnswers.setOnClickListener {
            txtReview.text = """
                1. True. Nelson Mandela was the president of South Africa from 1994 till 1999.
                2. False. Leonardo da Vinci painted the Mona Lisa.
                3. True. Shakespeare wrote the infamous play 'Romeo and Juliet'.
                4. True. Princess Diana married Prince Charles III.
                5. False. World War II lasted from 1939 to 1945.
            """.trimIndent()
        }



        val btnExitApp = findViewById<Button>(R.id.btnExitApp)
         btnExitApp.setOnClickListener {
             //exit the application
             finishAffinity()
         }




        }
    }
