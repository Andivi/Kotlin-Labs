var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!

        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "balance" -> balance()
            "deposit"-> deposit()
            "withdraw" -> withdraw()
            else -> println("Invalid command")
        }
    }
}

fun balance():Unit{
    println("Your current funds are $funds")
}

fun deposit() {
    val input: String
    print(" enter amount to deposit: ")
    input = readLine()!!
    val dePosit = input.toDouble()
    funds += dePosit
    println( " You just deposited $dePosit" )


}
fun withdraw(): Unit{
    var input: String
    println(" please enter password: ")
    input = readLine()!!
    if (input == pswd){
    println("enter amount to withdraw: ")
        input = readLine()!!
        val withDraw = input.toDouble()
         funds -= withDraw

        println(" You withdrew $withDraw")

    }
}