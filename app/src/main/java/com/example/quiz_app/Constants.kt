package com.example.quiz_app

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which country this flag belongs to ?",
            R.drawable.ic_kyrgysztan,
            "Ukraine", "China",
            "Kyrgyzstan", "Vietnam",
            3
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Which country this flag belongs to ?",
            R.drawable.ic_albanian,
            "Bulgaria", "Kazakhstan",
            "Hungary ", "Albanian",
            4
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "Which country this flag belongs to ?",
            R.drawable.ic_england,
            "England", "Dominica",
            "Denmark", "India",
            1
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "Which country this flag belongs to ?",
            R.drawable.ic_nigeria,
            "Nepal", "Fiji",
            "Nigeria", "Afghanistan",
            3
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "Which country this flag belongs to ?",
            R.drawable.ic_germany,
            "Israel", "Australia",
            "Canada", "Germany",
            4
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "Which country this flag belongs to ?",
            R.drawable.ic_poland,
            "Poland", "Peru",
            "Spain", "Kenya",
            1
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "Which country this flag belongs to ?",
            R.drawable.ic_kuwait,
            "Slovakia", "Kuwait",
            "Jamaica", "Ghana",
            2
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "Which country this flag belongs to ?",
            R.drawable.ic_russia,
            "France", "Nicaragua",
            "Ireland", "Russia",
            4
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "Which country this flag belongs to ?",
            R.drawable.ic_brazil,
            "Korea", "Brazil",
            "Taiwan", "Malaysia",
            2
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "Which country this flag belongs to ?",
            R.drawable.ic_africa,
            "Bolivia", "Portugal",
            "South Africa", "Uzbekistan",
            3
        )
        questionList.add(question10)


        return questionList
    }
}