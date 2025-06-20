package day2

import java.io.File

val example1 = "2x3x4"
val example2 = "1x1x10"
val examples = listOf(example1, example2)

val lines = File("/Users/Sten.Anderson/dev/codingfuntime/aoc2015/src/day2/input.txt").readLines()

// 2*l*w + 2*w*h + 2*h*l
fun part1():Int {
    val areas = lines.map {
        val split = it.split("x").map { it.toInt() }
       // println("Split: ${split}")
        findArea(split[0], split[1], split[2])
    }
    println(lines)
    println(areas)

    return areas.sum()
}

fun findArea(l:Int, w:Int, h:Int):Int {
    val sa = surfaceArea(l, w, h)
    val smallest = findSmallestSide(l, w, h)
    println("sa $sa, smallest $smallest")

    return sa + smallest
}

fun surfaceArea(l:Int, w:Int, h:Int) = 2*l*w + 2*w*h + 2*h*l

fun findSmallestSide(l:Int, w:Int, h:Int): Int {
    val s1 = l*w
    val s2 = w*h
    val s3 = h*l

    return Math.min(s1, Math.min(s2, s3))
}

fun main() {
    println("AoC 2015 Day 2")
    println("Smallest amount of paper ${part1()}")
}