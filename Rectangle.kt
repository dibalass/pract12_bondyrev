open class Rectangle() {
    var a:Int = 1
    var b:Int = 1
    var s:Int = 1
    var p:Int = 1
    fun vvod(){
        try {
                println("введи ширину")
                a = readLine()!!.toInt()
                println("введи длину")
                b = readLine()!!.toInt()
                if (a <= 0 || b <= 0)
                    println("введи числа больше 0")
                else{
                    s = a * b
                    p = 2*(a + b)
                }
        }
        catch (e:Exception){
            println("введи число")
        }
    }
    fun getS(){
        println("площадь = $s периметр $p")
    }
}