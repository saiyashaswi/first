/*the program to see the even and odd in the list
 * another program tells the number of even and odd in list
 * 
 * 
 */



fun main(){
   val markslist=listOf(12,33,43,433,8000)
   var counteven=0
   var countodd=0
    
    
    for(i in markslist){
    
    if(i % 2 == 0){
        
        println("even $i")
        counteven++
    }
    
    else{
        
        println("odd $i")
        countodd++
    }
    
    }
    
    println("there are $countodd number of odd")
    println("there are $counteven number of evens")
}
