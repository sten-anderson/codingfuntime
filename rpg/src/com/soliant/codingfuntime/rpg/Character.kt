package com.soliant.codingfuntime.rpg

abstract class Character(val name:String, var hp:Int) {
    
    abstract fun attack(characters:List<Character>)

    fun takeDamage(amount:Int, source:String, method:String) {
        hp -= amount
        println("$source $method $name for $amount points of damage!")
    }

    fun heal(amount:Int, source:String) {
        hp += amount
        println("$source healed $name for $amount points of health")
    }

    override fun toString(): String = name
}