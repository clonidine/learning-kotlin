class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Maria", 12)

    println("Name: ${person.name}, Age: ${person.age}")
}