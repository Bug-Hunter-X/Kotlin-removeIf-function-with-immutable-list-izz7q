```kotlin
fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.removeIf { it > 2 }
    println("Mutable List after removeIf: $mutableList") // Output: [1, 2]

    val immutableList = listOf(1, 2, 3, 4, 5)
    val filteredList = immutableList.filter { it <= 2 }
    println("Immutable List after filter: $filteredList") // Output: [1, 2]
}
```