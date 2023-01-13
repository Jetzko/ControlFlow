fun main(){
    for (i in 1..100 step 2){
       if (i < 50){
           printBiggerNumber(i)
       }
        else{
            printSmallerNumber(i)
        }
    }
}
fun printBiggerNumber(x : Int){
    println("Number < 50 $x")
}
fun printSmallerNumber(y : Int) {
    println("Number > 50 $y")
}