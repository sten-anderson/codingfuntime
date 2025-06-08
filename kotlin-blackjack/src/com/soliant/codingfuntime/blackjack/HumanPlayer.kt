package com.soliant.codingfuntime.blackjack

class HumanPlayer(name:String) : Player(name) {
    override fun play(game: Game): Boolean {
        print("Would you like to (h)it or (s)tay? ")
        val cmd = readln()
        return when (cmd) {
            "h" -> {
                println("$name was dealt ${game.deal(this)}")
                true
            }
            "s" -> {
                false
            }
            else -> {
                println("Unknown command: $cmd")
                true
            }
        }
    }

}