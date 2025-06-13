package com.soliant.codingfuntime.rpg

class Goblin() : Character("Lurch", 80), Monster {
    override fun attack(characters: List<Character>) {
        characters.filter {it is Hero}.minBy { it.hp }.takeDamage(15, name, "stabbed")
    }
}