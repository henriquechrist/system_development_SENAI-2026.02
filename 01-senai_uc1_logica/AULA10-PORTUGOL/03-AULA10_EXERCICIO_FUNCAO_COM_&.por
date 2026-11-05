programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
			
		escreva ("Nome: ","\n")
			leia(nome)
		escreva ("Idade: ","\n")
			leia(idade)
		
		imprimir(nome,idade)
		
		escreva("_______________________","\n")
		escreva(nome,"-",idade)
	}
	funcao imprimir (cadeia n, inteiro &i){
		escreva("Nome: ",n,"\n")
		escreva("Idade: ", i, "\n")
		n="Antônio"
		i=50	
	}



}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */