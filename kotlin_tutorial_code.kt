fun main(){
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)
 
    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")
 
    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")
 
    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")
 
 
    //Increment & Decrement operators (++, --)
    myNum = 10
    myNum++
    println("myNum++ is $myNum")
    println("--muNum is $myNum")
    // increments after use
    println("myNum++ is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
    
   when (6) {
    1 -> print("sunday")
    2 -> print("monday")
    3 -> print("tuesday")
    4 -> print("friday")
    5 -> print("friday")
    6 -> print("harry")
    else -> { // Note the block
        print("two of them are not possible to be same")
    }
}
   
   var x = 100
    while(x <=0){
        println("\n $x")
        x-=2
       
        
    }
   println("my loop is done!")

    
 for(num in 5..50)
 println("$num")
 
 println("___________________________________________________________________________________________________________________________________________________")
 
 
 
 for(i in 1 until 10)
 println("$i")
 

 
 println("___________________________________________________________________________________________________________________________________________________________")
 for(i in 10 downTo 1 step 2)
 println("$i")
 
 
 
}
