import java.util.Scanner;
fun main(){
   
    print("Enter an integer:")
    val marks = Integer.valueOf(readLine())
    println("You entered: $marks")
    
    if(marks <=100 && marks >=90){
        println("A* excellent!!")
    }
    else if(marks <=89 && marks >=80){
        println("A:very good")
    }
    else if(marks <=79 && marks >=70){
        println("B good")
    }
    
    else if(marks <=69 && marks >=60){
        println(" C bad")
    }
    
    else if(marks <=59 && marks >=50){
        println("D very bad")
    }
    else if(marks <=49 && marks >=40){
        println("E you should improve a lot!")
    }
    else if(marks <=39 && marks >=30){
        println("F you are practising very less!")
    }
    else if(marks <=29 && marks >=20){
        println("G you are practising very less!you should practise a lot.")
    }
    else if(marks <=19 && marks >=0){
        println("W loser practise a lot.")
    }
    
}
