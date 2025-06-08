package com.soliant.codingfuntime.blackjack

abstract class Player (val name:String) {
    private val hand = mutableListOf<Card>()

    override fun toString(): String = "$name, hand: $hand, score: ${score()}"

    fun addCard(card:Card) = hand.add(card)

    fun score():Int {
        var sum = hand.sumOf({it.rank.value})
        if (sum > 21) {
            var aceCount = hand.count({it.rank == Rank.Ace})
            while (aceCount > 0 && sum > 21) {
                sum -= 10
                aceCount -= 1
            }
        }
        return sum
    }

    abstract fun play(game:Game): Boolean
}