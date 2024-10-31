fun main() {
    println("Введите возраст")
    var age = readln().toInt()
    if (age<=0){
        println("Введено некорректное значение")
    }else if (age>=18){
        println("Совершеннолетний")
    }else{
        println("Несовершеннолетний")
    }
}