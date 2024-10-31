import kotlin.random.Random

fun main() {
    var num = readln().toInt()
    var size = readln().toInt()
    var array = IntArray(size)
    var bool= false
    for (i in 0 until array.size){
        array[i]=(0..100).random()
        if(array[i]==num) {
            bool = true
        }
    }
    print(bool)
}