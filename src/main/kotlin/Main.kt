interface Animal {
    fun sound(): String
}

class Dog : Animal {
    override fun sound(): String {
        return "Au, au!"
    }
}

class Cat : Animal {
    override fun sound(): String {
       return "Meow, meow, meow!"
    }
}

fun makeSound(animal: Animal) {
    println("Sound: ${animal.sound()}")
}

fun main() {
    makeSound(Cat())
    makeSound(Dog())
}