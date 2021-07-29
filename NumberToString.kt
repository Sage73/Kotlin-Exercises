// We need a function that can transform a number into a string.
// Examples:
//123 --> "123"
//999 --> "999"

fun main() {
    print(numberToString(3872))
}

fun numberToString(num: Int): String {
    return num.toString() // returning number converted to string
}