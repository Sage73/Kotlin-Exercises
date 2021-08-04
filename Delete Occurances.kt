/*
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */

fun main() {
    println(deleteNth(arrayOf(10,20,10,30), 1))
}

fun deleteNth(elements: Array<Int>, maxOcurrences:Int): MutableList<Int> {
    val newList = mutableListOf<Int>() // create new list
    for (i in elements) {
        if (!newList.contains(i)) { // if element is not in list,
            newList.add(i)          // add it
        } else {
            var counter = 0 // count how many of the same number there are
            for (item in elements) {
                if (i == item) {
                    counter++
                }
            }
            if (counter <= maxOcurrences) { // if the number of occurances doesn't exceed maxOccurances
                newList.add(i)              // add the number to the list
            }
        }
    }

    return newList
}