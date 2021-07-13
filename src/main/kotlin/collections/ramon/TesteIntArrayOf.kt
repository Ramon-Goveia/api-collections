package collections.ramon

fun main() {
    val values = intArrayOf(9, 3, 6, 2, 8, 7)

    values.forEach {
        println(it)
    }

    println("-----------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}