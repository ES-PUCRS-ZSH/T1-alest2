package edu.pucrs.zsh.adapter
import java.io.File

class TextReader {
	fun lerTexto (name: String): Pair<Int, ArrayList<Int>> {
		val inputString = File("src/main/resources/$name.txt")
		val reader = inputString.bufferedReader()

		val primeiraLinha = reader.readLine().trim().toInt()

		val receita = reader.readLine()
			.trim()
			.split(" ")
			.map { it.toInt() }

		if (receita.size != primeiraLinha) throw IllegalArgumentException("Linhas diferentes")

		return Pair(primeiraLinha, ArrayList(receita))
	}
}