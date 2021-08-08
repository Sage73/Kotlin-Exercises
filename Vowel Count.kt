/* Return the number (count) of vowels in the given string.

We will consider (a, e, i, o, u) as vowels (but not y). */

fun main() {
    println(getCount("example"))
}

fun getCount(str : String) : Int {
    var count = 0 // counter
    str.forEach {it -> // iterateing over each letter of the string, the letter takes the name of "it"
        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
            count++ // increasing count
        }
    }
    return count
}