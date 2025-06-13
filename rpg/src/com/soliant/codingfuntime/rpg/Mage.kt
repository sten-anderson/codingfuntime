package com.soliant.codingfuntime.rpg

class Mage(name:String) : Character(name, 70), Hero {
    override fun attack(characters: List<Character>) {
        //characters.first { it is Monster}.takeDamage(50, name, "burned")
        characters.first { it is Hero && it.name != name}.heal(50, name)
    }
}