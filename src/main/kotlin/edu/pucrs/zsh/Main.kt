package edu.pucrs.zsh


val leitor = TextReader()



fun main (){
	println("Hello World!")
//	println("Digite o nome do arquivo: ")
//	val nome: String = readln()

	val (primeiraLinha, segundaLinha) = leitor.lerTexto("casoteste")

	println("Numero do array: $primeiraLinha")
	println("Array: $segundaLinha")

}