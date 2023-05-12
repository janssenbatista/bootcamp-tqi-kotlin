package me.dio.kotlin.desafio01

fun main() {
    val media = readln().toDouble()
    when {
        media < 5.0 -> println("REP")
        media >= 5.0 && media < 7.0 -> println("REC")
        else -> println("APR")
    }
}