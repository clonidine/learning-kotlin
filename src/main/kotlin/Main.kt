fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    numbers.add(11)
    numbers.add(12)

    numbers.forEach {
        println("Element: $it")
    }
}