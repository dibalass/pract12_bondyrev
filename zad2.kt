import kotlinx.coroutines.*
import java.lang.NumberFormatException

fun main() {
    println("Введи имя пользователя")
    var log = readln()!!.toString()
    println("Введи пароль")
    var pas = readln()!!.toString()
    println("Введи кол-во участников")
    var kol = readln()!!.toInt()
    while (kol <= 0) {
        try {
            println("Введи кол-во участников")
            kol = readln()!!.toInt()
            break
        }
        catch (e: NumberFormatException) {
            println("Введи кол-во участников")
        }
    }
    val repos = Repositories()

    val users_and_repos = runBlocking {
        repos.GetInfo(kol)
    }

    runBlocking {
        repos.Block(false)
        println("Кол-во участников")
        users_and_repos.sortedWith(compareBy({ it.first }, { it.second })).forEach { user -> launch { repos.PrintUser(user) } }
        delay(3000)
    }
}