/*
You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.
 */

fun main() {
    println(smallEnough(intArrayOf(1,2,3,4,5,6), 5))
}

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var result = true
    a.forEach {
        if (it > limit) {
            result = false
        }
    }
    return result
}