/* Given an array of digital numbers, return a new array of length number containing the last even numbers from the original array (in the same order).
The original array will be not empty and will contain at least "number" even numbers.

For example:

([1, 2, 3, 4, 5, 6, 7, 8, 9], 3) => [4, 6, 8]
([-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26], 2) => [-8, 26]
([6, -25, 3, 7, 5, 5, 7, -3, 23], 1) => [6] */

fun main() {
    println(evenNumbers(listOf(2,3,1,4,5,7), 1))
}

fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    val len = array.size
    val myList = mutableListOf<Int>()
    for (num in 1..len) { // for each number from 1 to length of array
        if (myList.size < number) { // if myList doesn't contain enough number yet
            if (array[len-num]%2 == 0) { // check if the number in array is even
                myList.add(array[len-num]) // if so, add it
            }
        } else {
            break // break since there's no need to check for others numbers
        }
    }
    return myList.reversed()
}