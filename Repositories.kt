import kotlinx.coroutines.*
class Repositories()
{
    fun Block(block: Boolean){
        while(block == false){
            println("Заблокировано введи 'Загрузить'")
            var otvet = readln()!!.toString()
            if(otvet == "Загрузить"){
                break
            }
        }
    }

    suspend fun GetInfo(repCount: Int): List<Pair<Int, String>> = withContext(Dispatchers.IO)
    {
        val users = mutableListOf<Pair<Int, String>>()
        try {
            for(i in 1..repCount)
            {
                println("Введи имя $i")
                val name: String = readLine()!!
                println("Введи кол-во репозиториев")
                val repCount: Int = readLine()!!.toInt()
                users.add(repCount to name)
            }
        }
        catch (e: Exception) {
            println("не число")
        }
        users
    }

    suspend fun PrintUser(user: Pair<Int, String>)
    {
        delay(1000)
        println("${user.second  } - ${user.first} репозиториев")
    }
}