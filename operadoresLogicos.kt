//operadores lógicos 
 //E e Ou
 //E (&&) Ou (||) é duas barras ou dois ii (não sei)

 /**
 * OPERADORES In e Range
 * Se o o perador está presente em uma lista ou uma faixa (range) de valores
 * Range cria um intervalo de valores que inicia no parâmetro e acaba no segundo
 * 
 * contém (In)
 * não contém (!In)
 * 
 * Range/faixa de valores
 * (Int..Int)
 * 
 */

fun main() {
    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()

    println(number)
    println(number in bingo)
}