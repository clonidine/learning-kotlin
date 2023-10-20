class Person(val name: String, val age: Int) {
    fun canAccess(): Boolean {
        return this.age >= 18
    }
}

fun main() {
    val person = Person("Maria", 12)

    println("Name: ${person.name}, Age: ${person.age}, Can access: ${person.canAccess()}")
}