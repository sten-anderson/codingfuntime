package com.soliant.codingfuntime.rpg

class Troll() : Character("Bob the Troll", 200), Monster {
    override fun attack(characters:List<Character>) {
        characters.first { it is Fighter}.takeDamage(50, name, "clubbed")
    }
}