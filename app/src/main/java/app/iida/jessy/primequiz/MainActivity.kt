package app.iida.jessy.primequiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object{
        private const val QUESTION_CONUT: Int = 10
    }

    var random: Random = Random()
    val questions: IntArray = IntArray(QUESTION_CONUT)
    var point: Int = 0
    var answerCount: Int = 0
    var textView = findViewById<TextView>(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0 until QUESTION_CONUT){
            val number = random.nextInt(1000)
            Log.d("Number","QUESTION_" + i + ":" + number.toString())
            questions[i] = number;
        }
        point = 0
        answerCount = 0

        textView.text = questions[answerCount].toString()
        textView.setTextColor(Color.BLACK)
    }
}
