fun main() {
    val x = readLine()
    val y: Boolean = x?.length == 1 &&  x[0].isLetter()
    println(y)
}