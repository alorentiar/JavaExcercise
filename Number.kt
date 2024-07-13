fun main(){
    var age: Int = 200

    println(age)

    //literals

    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF //0x untuk memberitahu bahwa ini hexadecimal
    var binaryLiteral: Int = 0b0001 //0b untuk binary

    //underscore in number
    var age1: Byte = 3_0 //only separator

    var byteAge: Byte = age.toByte()
    print(byteAge)
}
