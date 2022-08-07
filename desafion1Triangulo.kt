// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main() {
    val input = readLine()!!
    val a = input.split(" ")[0].toFloat()
    val b = input.split(" ")[1].toFloat()
    val c = input.split(" ")[2].toFloat()
  
  //TODO: Complete os espaços em branco com uma possível solução para o desafio
   
    val perimetro =   a+b+c 
    val area = ((a+b)*c)/2
    
    if (a<(  b+c  ) &&  b<( a+c    ) &&  c<(  b+a    )){
        println(String.format("Perimetro = %.1f",   perimetro     ))
    }else{
        println(String.format("Area = %.1f",  area      ))
    } 
      
  }