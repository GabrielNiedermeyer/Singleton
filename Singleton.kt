class User(val id: Int, val name: String?)

/*
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object)
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

    private val users = mutableListOf<User>()

    fun addUser(name: String?) {
        users.add(User(users.size + 1, name))
    }

    fun listUsers() {
        users.forEach{
            println("${it.id} - ${it.name}")
        }
        //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
    }
}

fun main() {
    val quantity: Int = readLine()!!.toInt()/*?.toIntOrNull() ? : 0 */

    for (i in 1..quantity) {
        val name = readLine()
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}