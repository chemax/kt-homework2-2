package ru.netology

fun main() {
    val likes: Int = 21
    val phraseEnding = if (likes != 11 && likes % 10 == 1) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $phraseEnding")
}