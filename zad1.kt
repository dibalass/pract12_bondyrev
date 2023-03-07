import kotlinx.coroutines.*

suspend fun main()= coroutineScope{
    println("введи N")
    var n:Int = readLine()!!.toInt()
    var rec:Rectangle=Rectangle()
    launch{
        for(i in 0..n){
            rec.vvod()
            rec.getS()
            delay(5000L)
        }
    }
    for(i in 1..3){
        println("для $i прямоугольника")
        delay(7000L)
    }
}