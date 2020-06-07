package kopicon.harshit.anxietytestapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val scoreOne: Int,
    val scoreTwo: Int,
    val scoreThree: Int,
    val scoreFour: Int
)
