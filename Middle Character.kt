/* You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters. */

fun main() {
    println(getMiddle("middle"))
}

fun getMiddle(word : String) : String {
    val length = word.length
    if (length % 2 == 0) { // if length is even
        return word.substring(length / 2 - 1, length / 2 + 1)
    } else {               // if lenght is odd
        return word.substring(length / 2, length / 2 + 1)
    }
}