fun main(){
    //kotlin mendukung 2 variable mutable=bisadiubah dan immutable=tidakbisadiubah
    //mutable pake var, immutabel pake val
    //direkomendasikan pake immutable drpada mutable
    var testVar = "String";
    val testVal = "Halo";

    println(testVar)
    println(testVal)

//    testVal = "yuhu"
    testVar =  "haha"

    println(testVar)
    println(testVal)
}