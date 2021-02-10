package com.example.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionList = Constants.getQuestions()
        val currentPosiion = 1
        val question: Question? = questionList[currentPosiion - 1]
        progressBar.progress = currentPosiion
        tv_progress.text ="$currentPosiion" + "/" + progressBar.max

        tvQuestion.text = question!!.question
        iv_imageFlag.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }
}