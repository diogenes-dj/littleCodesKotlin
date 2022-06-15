fun main() {
    val empty = "" // vazia é pq não tem nada mesmo
    println(empty.length)
	
    val blank = "              " //em branco variavel com espaço maior q zero e todos esses espaços estão em branco
    println(blank.length)
    
    println(empty.isEmpty() && empty.isBlank())
    //println(blank.isEmpty())
}