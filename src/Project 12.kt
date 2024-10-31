fun main() {
    println("Введите длинну массива")
    var size = readln().toInt()
    var arr = IntArray(size)
    println("Введите число")
    arr[0]=readln().toInt()
    for(i in 1 until  arr.size){
        arr[i]=arr[i-1]*2
    }
    for (i in 1 until arr.size-1){
        println(arr[i])
    }

}