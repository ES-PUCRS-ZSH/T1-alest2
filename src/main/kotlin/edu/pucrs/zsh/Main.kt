package edu.pucrs.zsh

import edu.pucrs.zsh.adapter.TextReader
import edu.pucrs.zsh.service.ShuffleLogic


val leitor = TextReader()



fun main (){
//	println("Hello World!")
	println("Digite o nome do arquivo: ")
	val nome: String = readln()

	val (primeiraLinha, segundaLinha) = leitor.lerTexto(nome)
	val shuffleLogic = ShuffleLogic()

	println(primeiraLinha)
	println(shuffleLogic.findRep(segundaLinha))

//	println(segundaLinha)

}