package com.soliant.codingfuntime.blackjack

class Game {
    val players = listOf(HumanPlayer("Sten"), AiPlayer(), Dealer())
    val deck = Rank.entries.flatMap { r -> Suit.entries.map { s -> Card(r, s)}}.shuffled().toMutableList()

    fun newGame() {
        repeat(2) {
            players.forEach { deal(it) }
        }
        println(this)
    }

    fun deal(player:Player):Card {
        val card = deck.removeFirst()
        player.addCard(card)

        return card
    }

    override fun toString(): String = players.joinToString("\n")

    fun isBusted(player:Player) = player.score() > 21

    fun endGame() {
        println(this)
        players.forEach {
            if (isBusted(it)) {
                println("${it.name} is busted!")
            }
        }
        players.filter { !isBusted(it) }.forEach {
            if (it.score() > players.last().score()) {
                println("${it.name} beats ${players.last().name}!")
            }
        }
    }

    fun start() {
        println("Welcome to Blackjack.")
        newGame()
        players.forEach { player ->
            while(!isBusted(player) && player.play(this)) {}
        }

        endGame()
        println("Thanks for playing!")
    }
}