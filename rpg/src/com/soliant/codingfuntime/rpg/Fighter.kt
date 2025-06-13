package com.soliant.codingfuntime.rpg

class Fighter(name:String) : Character(name, 100), Hero {
    override fun attack(characters:List<Character>) {
        characters.first { it is Monster}.takeDamage(20, name, "slashed")
    }
}