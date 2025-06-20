package day1

import java.io.File

val line = File("/Users/Sten.Anderson/dev/codingfuntime/aoc2015/src/day1/input.txt").readLines().first()

fun part1() {
    val floorNumber = line.count { it == '('} - line.count { it == ')'}
    println("Floor number $floorNumber")
}

fun part2() {
    var floorNum = 0
    var position = 0
    while (floorNum != -1) {
        floorNum += if (line[position] == '(') 1 else -1
        position++
    }
    println("Basement level -1 was hit at position $position")
}

fun main() {
    println("AoC 2015 Day1")
    println("Number of characters ${line.length}")
    part2()
}