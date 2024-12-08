package Day01

import println
import readInput
import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val left: List<Int> = input.map { it.split("   ")[0].toInt() }.toList().sorted()
        val right: List<Int> = input.map { it.split("   ")[1].toInt() }.toList().sorted()
        var diff = 0
        left.forEachIndexed { index, i ->
            diff += abs((i - right[index]))
        }
        return diff
    }

    fun part2(input: List<String>): Int {
        val left: List<Int> = input.map { it.split("   ")[0].toInt() }.toList().sorted()
        val right: List<Int> = input.map { it.split("   ")[1].toInt() }.toList().sorted()
        var sum = 0
        left.forEach() { l ->
            var i = 0
            right.forEach() { r ->
                if (l == r) {
                    i = i.inc()
                }
            }
            sum += (l * i)
        }
        return sum
    }

    val testInput = readInput("Day01/Day01_test")
    check(part1(testInput) == 11)

    val input = readInput("Day01/Day01")
    check(part1(input) == 1873376)
    check(part2(input) == 18997088)

    part1(input).println()
    part2(input).println()
}
