package com.phamspect.headsupgame

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    //vars
<<<<<<< Updated upstream
    private lateinit var startButton: Button
    private lateinit var stopButton: Button
    private lateinit var currentTime: TextView
    private lateinit var timer: CountDownTimer
    private  var isRunning = false
    private lateinit var category: String
=======
    private lateinit var category: String
    //TODO make dictionary key:value cat1:listof(words)
>>>>>>> Stashed changes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< Updated upstream
        //vars to id
        startButton = findViewById(R.id.startButt)
        currentTime = findViewById(R.id.catTxt)

=======
        //category buttons
        makeCategoryButton()
>>>>>>> Stashed changes
        //start button listener
        makeStartButton()
    }

    private fun makeStartButton(){
        var startButton: Button = findViewById(R.id.startButt)
        startButton.setOnClickListener {
            if(!isRunning){
                timer = object : CountDownTimer(30000, 1000) {

                    override fun onTick(millisUntilFinished: Long) {
                        currentTime.text = (millisUntilFinished / 1000).toString()
                    }

                    override fun onFinish() {
                        currentTime.text = "done!"
                    }

                }.start()
                isRunning = true
            }else{
                //Say timer is already running
            }
        }

        makeCategoryButtons()
        //end button listener
//        stopButton.setOnClickListener {
//            if(isRunning){
//                timer.cancel()
//                isRunning = false
//            }
//        }
    }

    private fun makeCategoryButtons(){
        setContentView(R.layout.activity_main)

        var button:Button = findViewById(R.id.cat1)

        button.setOnClickListener{
            category = button.text.toString()
        }
        var button2 = findViewById<Button>(R.id.cat2)
        button2.setOnClickListener{
            category = button2.text.toString();
        }
        var button3 = findViewById<Button>(R.id.cat3)
        button3.setOnClickListener{
            category = button3.text.toString();
        }
        var button4 = findViewById<Button>(R.id.cat4)
        button4.setOnClickListener{
            category = button4.text.toString();
        }
        var button5 = findViewById<Button>(R.id.cat5)
        button5.setOnClickListener{
            category = button5.text.toString();

        }
        var button6 = findViewById<Button>(R.id.cat6)
        button6.setOnClickListener{
            category = button6.text.toString();
            currentTime.text = button6.text.toString()
        }
        var button7 = findViewById<Button>(R.id.cat7)
        button7.setOnClickListener{
            category = button7.text.toString();
            currentTime.text = button7.text.toString()
        }
        var button8 = findViewById<Button>(R.id.cat8)
        button8.setOnClickListener{
            category = button8.text.toString();
            currentTime.text = button8.text.toString()
        }
        var button9 = findViewById<Button>(R.id.cat9)
        button9.setOnClickListener{
            category = button9.text.toString();
            currentTime.text = button9.text.toString()
        }
    }

<<<<<<< Updated upstream
=======
    private fun makeCategoryButton(){
        val buttonIds = listOf(
            R.id.cat1, R.id.cat2, R.id.cat3,
            R.id.cat4, R.id.cat5, R.id.cat6,
            R.id.cat7, R.id.cat8, R.id.cat9
        )
        for (buttonId in buttonIds) {
            val button = findViewById<Button>(buttonId)
            button.setOnClickListener {
                category = button.text.toString()
            }
        }
    }
>>>>>>> Stashed changes
}