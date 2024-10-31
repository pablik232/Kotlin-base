fun main() {
    println("Введите число от 1 до 7")
    var day = readln().toInt()
    when(day){
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Введено некорректное значение")
    }
}