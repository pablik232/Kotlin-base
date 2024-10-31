fun main(){
    println("Введите два символа слитно")
    var num = readln()
    var x = num[0].toChar()
    var y = num[1].toChar()
    if (x>=y){
        print(x-y)
    }else{
        print(y-x)
    }

}