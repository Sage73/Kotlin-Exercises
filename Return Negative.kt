// In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

fun main() {
    println(makeNegative(732))
}

fun makeNegative(x: Int): Int {
    var result: Int = x
    if (x == 0) {
        // do nothing
    } else if (x < 0) {
        // do nothing again
    } else {
        val doubleX = x * 2
        result = x - doubleX
    }
    return result
}