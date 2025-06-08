package com.soliant.codingfuntime.blackjack

data class Card(val rank:Rank, val suit:Suit) {
    override fun toString(): String = "$rank of $suit"
}
