import kotlin.random.Random

fun main() {
    var size = readln().toInt()
    var sizeNew = readln().toInt()
    var arr= IntArray(size)
    var newArr = IntArray(sizeNew)
    for (i in 0 until arr.size){
        arr[i]=(0..100).random()
        for (j in newArr.size-1 downTo 0){
            newArr[j]=arr[i]
        }
    }
    for (i in 0 until newArr.size){
        println("${arr.get(i)} ${newArr.get(i)}" )
    }
}