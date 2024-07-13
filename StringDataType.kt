fun main(){

    var firstName: String = "Udin"
    var lastName: String = "Gambut"

    var address: String = """
        Jalan belum jadi,
        Kab Subang,
        Jawa Barat,
        Indonesia
    """.trimIndent()


    println(firstName)
    println(lastName)
    println(address)

    //String Template
    var fullName: String = "$firstName $lastName"
    println(fullName)

    //operasi kompleks ${fullName.length}
    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}