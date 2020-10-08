// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean

    fun toSleep() {
        print()
    }
}

fun main() {

    // TODO 2
    val gippy = Cat

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}