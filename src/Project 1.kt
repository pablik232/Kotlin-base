fun main() {
    print("Введите количество чисел: ")
    var num= readln().toInt()
    var sum = 0f;
    for (i in 1..num) {
        print("$i число = ")
        sum += readln().toFloat()
    }
    print("Среднее арифмитическое = " + sum/num)



}