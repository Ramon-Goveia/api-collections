package collections.ramon

fun main() {
    val nomes = Array( 5){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Pedro"
    nomes[3] = "Luis"
    nomes[4] = "Josefa"

    for(nome in nomes){
        println(nome)
    }

    println("-----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------------------")
    val nomes2 = arrayOf("Maria", "José", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}