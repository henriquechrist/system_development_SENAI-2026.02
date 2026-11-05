programa
{	
	funcao inicio()
	{
		inteiro x,y
		escreva("Digite os valores: ","\n")
		leia(x,y)
		escreva("O resultado é: ",soma(x,y),"\n")
		escreva("Valor de x: ",x,"\n")
		escreva("Valor de y: ",y,"\n")
		
	}
	funcao inteiro soma(inteiro &x, inteiro &y)
	{
	inteiro resultado
	resultado = x+y
	x=10
	y=20
	retorne resultado
	0
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */