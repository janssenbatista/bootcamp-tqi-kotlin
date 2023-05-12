package me.dio.kotlin.desafio05

data class Pais(var habitantes: Double, var taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
        habitantes += habitantes * (taxaCrescimento / 100)
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble();
    val habitantesPaisB = readLine()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        quantidadeAnos++
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
    }

    println("$quantidadeAnos anos")
}