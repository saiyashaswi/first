fun main(){
     val students:MutableMap<Int, String> = mutableMapOf(100 to "sai", 101 to "ashrith", 102 to "venkat", 103 to "sunnybrother", 104 to "om", 105 to "pari")
      val input:Int=106
    students.put (106, "manas")
    println("name of the student is "+ students.getValue(input))
    
}
