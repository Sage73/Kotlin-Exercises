/* Given three integers a, b, c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
Consider an Example :
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1 ≤ a,b,c ≤ 10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8. */

fun main() {
    println(expressionsMatter(1,10,1))
}

fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    val r1 = a * (b + c)
    val r2 = a * b * c
    val r3 = a + b * c
    val r4 = (a + b) * c
    val r5 = a + b + c

    val max = if (r1 >= r2 && r1 >= r3 && r1 >= r4 && r1 >= r5) {
        r1
    } else if (r2 >= r3 && r2 >= r4 && r2 >= r5) {
        r2
    } else if (r3 >= r4 && r3 >= r5) {
        r3
    } else if (r4 >= r5) {
        r4
    } else {
        r5
    }

    return max
}