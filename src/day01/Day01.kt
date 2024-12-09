package day01

import println
import readInput
import kotlin.math.abs

data class Input(
    val left: List<Int>,
    val right: List<Int>,
)

fun main() {
    fun treatInput(input: List<String>): Input = Input(
           input.map { it.split("   ")[0].toInt() }.toList().sorted(),
           input.map { it.split("   ")[1].toInt() }.toList().sorted()
    )

    fun part1(input: Input): Int {
    return input.left.zip(input.right).sumOf { (l, r) -> abs(l - r) }
}

    fun part2(input: Input): Int {
    return input.left.sumOf { l ->
        val count = input.right.count { r -> l == r }
        l * count
    }
}

    val testInput = treatInput(readInput("day01/Day01_test"))
    check(part1(testInput) == 11)

    val input = treatInput(readInput("day01/Day01"))
    check(part1(input) == 1873376)
    check(part2(input) == 18997088)

    part1(input).println()
    part2(input).println()
}
