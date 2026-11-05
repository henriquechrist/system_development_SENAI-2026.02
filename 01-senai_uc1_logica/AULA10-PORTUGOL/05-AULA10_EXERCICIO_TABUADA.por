programa
{
	inclua biblioteca Util
	
	
	funcao inicio()
	{
	inteiro n1
	escreva("Digite o Nº: ","\n")
	leia(n1)
	continhas(n1)
	}

	funcao inteiro continhas ( inteiro a) 
	{
	inteiro i
	i=1
	faca{
		escreva("O resultado de ",a," * ",i," é ",a*i,"\n")
		i=i++
	}
	enquanto (i<=10)

	retorne i
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */