fun main() {
    val text =(txt("akirachix"))


    val b =(names("Megan",12))
    println(b)
    val c =(names("Joe",8))
    println(c)
    //
    val d =(long("photography"))
    println(d)
    val e =(long("Accountability"))
    println(e)
    //
    confirm("Joe")
    confirm("Megan")

}
//Question 1//
fun txt(name: String) {
    val text = "akirachix"
    println(text[0] +"" +text[2] +""+text[3])

}

//Question 2//
fun names(name:String,age:Int): String {
    val message =  "My name is $name Iam $age years old"
     return message
}
//Question 3//
fun long(names: String): Int{
    val photo = names.length
        return photo
}
//Question 4//
fun confirm(name: String){
    val names = "Megan"
    if (names.equals(name)){
        println("Thats me!")
        }else{
            println("I dont know who that is")
    }


}

