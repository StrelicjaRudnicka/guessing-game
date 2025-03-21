import kotlin.random.Random

fun main() {
    val maxNumber = 100
    val targetNumber = Random.nextInt(maxNumber)
    var hasWon = false

    while(!hasWon) {
        print("Enter a number between 1 and $maxNumber: ")
        val userInput = readln()
        val number = userInput.toIntOrNull()

        if (number != null) {
            hasWon = checkNumber(number, targetNumber, number)
        } else {
            println("That's not the right number")
        }
    }
}

fun checkNumber(number: Int, targetNumber: Int, userInput: Int) : Boolean {
    if (number < targetNumber) {
        println("The number is greater than $userInput")
        return false
    } else if (number > targetNumber) {
        println("The number is lesser than $userInput")
        return false
    } else {
        println("You win! the number is $targetNumber.")
        return true
    }
}