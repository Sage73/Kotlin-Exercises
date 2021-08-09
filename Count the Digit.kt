import kotlin.math.pow


/*
Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.

Square all numbers k (0 <= k <= n) between 0 and n.

Count the numbers of digits d used in the writing of all the k**2.

Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.

Examples:
n = 10, d = 1
the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
We are using the digit 1 in: 1, 16, 81, 100. The total count is then 4.

nb_dig(25, 1) returns 11 since
the k*k that contain the digit 1 are:
1, 16, 81, 100, 121, 144, 169, 196, 361, 441.
So there are 11 digits 1 for the squares of numbers between 0 and 25.
Note that 121 has twice the digit 1.
 */

fun main() {
    println(nbDig(5750, 0))
}

fun nbDig(n:Int, d:Int):Int {
    var count = 0
    val listSquares = mutableListOf<Int>()
    for (num in 0 .. n) {
        listSquares.add(num.toDouble().pow(2.0).toInt()) // adding all squares to listSquares
    }
    listSquares.forEach { i ->   // for each number of listSquares
        digits(i).forEach {      // for each number of the digits of each number from listSquares
            if (it == d) {       // if the digit equals d increase count
                count++
            }
        }
    }
    if (d == 0) { // since the first 0 doesn't get counted when d is 0, we are going to add it now
        count++
    }
    return count
}

fun digits(i: Int): List<Int> { // this function returns all digits of a number in a list
    var i = i
    val digits: MutableList<Int> = ArrayList()
    while (i > 0) {
        digits.add(i % 10)
        i /= 10
    }
    return digits
}