package com.soliant.codingfuntime.blackjack

class Dealer() : Player("Dealer") {

    override fun play(game: Game): Boolean =
        if (score() < 17) {
            println("$name was dealt ${game.deal(this)}")
            true
        } else {
            false
        }
}