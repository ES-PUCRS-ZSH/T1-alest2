package edu.pucrs.zsh.service

import java.math.BigInteger

class ShuffleLogic {
	fun mmc(a:BigInteger, b:BigInteger): BigInteger{
		return a.multiply(b).divide(a.gcd(b))
	}

	fun findCicle(recipe: ArrayList<Int>):ArrayList<Int>{
		val visited = BooleanArray(recipe.size) {false}
		val cicle = arrayListOf<Int>()

		for (i in recipe.indices){
			if(!visited[i]){
				var x = i
				var cicleSize = 0
				while (!visited[x]){
					visited[x] = true
					cicleSize++
					x = recipe[x]
				}
				cicle.add(cicleSize)
			}
		}
		return cicle
	}

	fun findRep(lista: ArrayList<Int>):BigInteger{
		val cicles = findCicle(lista)
		return cicles.map { it.toBigInteger() }
			.reduce{ acc, it -> mmc(acc, it)}
	}
}