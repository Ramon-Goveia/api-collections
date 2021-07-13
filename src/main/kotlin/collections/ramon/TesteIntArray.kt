package collections.ramon

fun main() {
    val values = IntArray(5)
    values[0] = 9
    values[1] = 3
    values[2] = 6
    values[3] = 7
    values[4] = 1

    for (valor in values){
        println(valor)
    }

    println("------------------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("------------------------------------")
    for(index in values.indices){
        println(values[index])
    }

    println("------------------------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}