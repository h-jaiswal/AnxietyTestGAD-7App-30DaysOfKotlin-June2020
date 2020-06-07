package kopicon.harshit.anxietytestapp


import kopicon.harshit.anxietytestapp.R
import kopicon.harshit.anxietytestapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val TOTAL_SCORE: String = "total_score"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
            1, "Feeling nervous, anxious or on edge?",
            R.drawable.ic_flag_of_argentina,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Not being able to stop or control worrying?",
            R.drawable.ic_flag_of_australia,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Worrying too much about different things?",
            R.drawable.ic_flag_of_brazil,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Trouble relaxing?",
            R.drawable.ic_flag_of_belgium,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Being so restless that it is hard to sit still?",
            R.drawable.ic_flag_of_fiji,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Becoming easily annoyed or irritable?",
            R.drawable.ic_flag_of_germany,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Feeling afraid as if something awful might happen?",
            R.drawable.ic_flag_of_denmark,
            "Not al all", "Several days",
            "More than half the days", "Nearly every day", scoreOne = 0, scoreTwo = 1, scoreThree = 2, scoreFour = 3
        )
        questionsList.add(que7)


        return questionsList
    }
}