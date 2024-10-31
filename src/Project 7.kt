fun main() {
    var string: String? = null
    println(string?.length)
    println("Введите строку")
    string = readLine()
    println(string?.length)
}