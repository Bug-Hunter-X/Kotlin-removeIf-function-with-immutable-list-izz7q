# Kotlin `removeIf` with Immutable List
This example demonstrates a common error when using the `removeIf` function in Kotlin with an immutable list.  The `removeIf` function modifies the list in place, so it only works with mutable lists (created using `mutableListOf`). Attempting to use it with an immutable list (created with `listOf`) will result in a compile-time error.

The solution shows how to properly handle this situation by using a mutable list or by creating a new list containing only the elements that satisfy the condition.