// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1

//TODO: Complete os espaços em branco com uma possível solução para o desafio

    for (i in 1..(n -1)) {
        print("$a ")
        
        val sum = a+b
        a =  b
        b =  sum
    }
    println("$a")
}