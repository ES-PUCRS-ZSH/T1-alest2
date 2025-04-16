package edu.pucrs.zsh.service

import java.math.BigInteger

class ShuffleLogic {
	private fun mmc(a:BigInteger, b:BigInteger): BigInteger{
		return a.multiply(b).divide(a.gcd(b))
	}

	private fun findCycle(recipe: ArrayList<Int>):ArrayList<Int>{
		val visited = BooleanArray(recipe.size) {false}
		val cycle = arrayListOf<Int>()

		for (i in recipe.indices){
			if(!visited[i]){
				var x = i
				var cycleSize = 0
				while (!visited[x]){
					visited[x] = true
					cycleSize++
					x = recipe[x]
				}
				cycle.add(cycleSize)
			}
		}
		return cycle
	}

	fun findRep(lista: ArrayList<Int>):BigInteger{
		val cycles = findCycle(lista)
		return cycles.map { it.toBigInteger() }
			.reduce{ acc, it -> mmc(acc, it)}
	}
}

/*
* fun detectarCiclo(posicaoRobos: List<Int>, receita: List<Int>) {
    val posicoes = mutableSetOf<List<Int>>()
    var rodada = 0
    var posicaoAtual = posicaoRobos

    while (true) {
        if (posicoes.contains(posicaoAtual)) {
            println("Ciclo detectado na rodada: $rodada")
            break
        }

        posicoes.add(posicaoAtual)
        println("Rodada: $rodada Posição: $posicaoAtual")

        val novaPosicao = receita.map { posicaoAtual[it] }
        posicaoAtual = novaPosicao

        rodada++
    }
}
* */