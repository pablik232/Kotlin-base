fun main() {
    println("Введите возраст")
    var age = readln().toInt()
    if (age>0&&age<65){
        when(age){
            in 1..12 -> println("ребёнок")
            in 13..17 -> println("подросток")
            in 18..64 -> println("взрослый")
        }
    }else if (age >= 65){
        println("пожилой")
    }else {
        println("Введено некорректное значение")
    }
}