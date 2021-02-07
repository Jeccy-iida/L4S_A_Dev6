package app.iida.jessy.primequiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    companion object {
        private const val QUESTION_COUNT = 10
    }

    var random: Random = Random()
    val question: IntArray = IntArray(QUESTION_COUNT)
    var point: Int = 0
    var answerCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)

        for (i in 0 until  QUESTION_COUNT){
            val number = random.nextInt(1000)
            Log.d("Number","Question"+ number.toString())
            question[i] = number
        }

        point = 0
        answerCount = 0

        textView.text = question[answerCount].toString() + ""
        textView.setTextColor(Color.BLACK)


    }
}

