package com.soliant.codingfuntime.rpg

class Game {
    val characters = listOf(Fighter("Aragorn"), Troll(), Mage("Gandalf"), Goblin(), Goblin())

    fun play() {
        println("The Game is afoot!")
        characters.forEach {
            it.attack(characters)
        }
        characters.forEach {
            println("$it has ${it.hp} hp remaining.")
        }
    }
}

fun main(args: Array<String>) {
    println("Welcome to the RPG")
    Game().play()
}