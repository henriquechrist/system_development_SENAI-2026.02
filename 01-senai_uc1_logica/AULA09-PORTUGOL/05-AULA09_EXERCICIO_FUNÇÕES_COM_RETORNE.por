programa
{
	//CRIAR UMA FUNÇÃO PARA RECEBER DOIS PARAMETROS E CALCULAR A SOMA
	funcao inicio()
	{
	inteiro num1, num2, resposta
	escreva("Primeiro Nº:","\n")
		leia(num1)

	escreva("Segundo Nº:","\n")
	leia(num2)

	resposta = soma(num1,num2)
	escreva("Resposta: ",resposta)
	
	}

	funcao inteiro soma(inteiro n1,inteiro n2)
	{ 
	inteiro resultado
	resultado = n1+n2
	retorne resultado
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */