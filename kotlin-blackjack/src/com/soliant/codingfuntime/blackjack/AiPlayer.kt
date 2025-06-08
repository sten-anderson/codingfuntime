package com.soliant.codingfuntime.blackjack

class AiPlayer : Player("AI Player") {
    override fun play(game: Game): Boolean =
        if (score() < 12) {
            game.deal(this)
            true
        } else {
            false
        }

}