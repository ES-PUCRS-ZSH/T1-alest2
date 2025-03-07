package edu.pucrs.zsh
import java.io.File

class TextReader {
	fun lerTexto (name: String): Pair<String, ArrayList<Int>> {
		val inputString = File("src/main/resources/$name.txt")
		val reader = inputString.bufferedReader()
		val primeiraLinha = reader.readLine()
		val segundaLinha = reader.readLines()

		val numeros = ArrayList<Int>()

		for(line in segundaLinha) {
			val numerosString = line.split(" ")

			for(numero in numerosString){
				numeros.add(numero.toInt())
			}

		}

		return Pair(primeiraLinha, numeros)
	}
}