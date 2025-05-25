package vcmsa.ci.flashcardquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    //set up the questions array
    private val questions = arrayOf("Nelson Mandela was the president of South Africa in 1994.",
        "Vincent van Gogh painted the Mona Lisa.",
        "Shakespeare wrote 'Romeo and Juliet'.",
        "Princess Diana married Prince Charles III.",
        "World War II lasted from 1939 to 1947.")
    //set up the answers array
    private val answers = arrayOf(true, false, true, true, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



        //find the buttons and textview by their ID
        val btnNextQuestion = findViewById<Button>(R.id.btnNextQuestion)
        val btnTrue = findViewById<Button>(R.id.btnTrue)
        val btnFalse = findViewById<Button>(R.id.btnFalse)
        val txtQuestions = findViewById<TextView>(R.id.txtQuestions)
        val txtAnswers = findViewById<TextView>(R.id.txtAnswers)

        //set up the score and index variables
        var score = 0
        var index = 0

        //set up the next question function to display the next question and clear the answer textbox
        fun nextQuestion() {
            txtQuestions.text = questions[index]
            txtAnswers.text = ""
        }
        //set up the answer check function to check the answer and display the result
        fun answerCheck(userAnswer: Boolean) {
            val correctAnswer = answers[index]
            if (userAnswer == correctAnswer) {
                score++
                txtAnswers.text = "Correct!"
            } else {
                txtAnswers.text = "Incorrect!"
            }
        }
            //set up the button click listeners to check the answer
            btnTrue.setOnClickListener {answerCheck(true)}
            btnFalse.setOnClickListener {answerCheck(false)}

            //set up the next question button click listener to move to the next question
          btnNextQuestion.setOnClickListener {
              index++
              if (index < questions.size) {
                  nextQuestion()
              } else {
                  //go to the next screen once all the questions have been answered
                  val intent = Intent(this, MainActivity3::class.java)
                  intent.putExtra("score", score)
                  startActivity(intent)
              }
          }
            //call the nextQuestion function to display the first question
            nextQuestion()



        val btnTerminate = findViewById<Button>(R.id.btnTerminate)
        btnTerminate.setOnClickListener {
            //exit the application
            finishAffinity()
        }

    }
}