/** Tipos de FOR
 * downTo(), until(), step(), letters()
 * 
 */
fun main() {
    downTo() //faz a contagem regressiva
    println()
    println()
    until() //conta até o valor anterior ao que vc estipular
    println()
    println()
    step(4) // entre parenteses vc coloca a quantidade q ele vai pular
    println()
    println()
    letters()//imprime em cada linha uma letra. cada posição do Array
    }
        
        fun downTo(){
            for(i in 20 downTo 0){
            print("$i ")
            }
        }
        
        fun until(){
            for(i in 0 until 20){
            print("$i ")    
            }
        }
         
        fun step(num:Int){
            for(i in 0..20 step num){
            print("$i ")    
            }
        }
        
        fun letters(){
            val sArray = "Olha essa string!"
            for(i in sArray){
            println(i.toUpperCase())    
            }
        }