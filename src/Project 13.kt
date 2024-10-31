fun main() {
    println("Введите точку отсчёта")
    var num: Int? = readln().toInt()
    for (i in num?.downTo(0)!!){
        println(i)
    }
}