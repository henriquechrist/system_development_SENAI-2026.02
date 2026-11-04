programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	cadeia nome
	real salario, vendas, comiss

	escreva("Qual o seu nome?","\n")
		leia(nome)
	
	Util.aguarde(500)

	escreva("Qual o seu salário?","\n")
		leia(salario)

	Util.aguarde(500)

	escreva("Qual o valor vendido?","\n")
		leia(vendas)	
			comiss = calcular (vendas)
	
	Util.aguarde(500)

	limpa()

	escreva("Sistema de Gestão de Vendedores","\n")

	Util.aguarde(300)


	escreva("Nome: ",nome,"\n")
	escreva("Salário: R$ ",salario,"\n")
	escreva("Vendas: ",vendas,"\n")
	escreva("Comissão: R$",comiss,"\n")
	escreva("__________________________","\n")
	escreva("Salário final: ",salario+comiss)
		
		
	}
	
	funcao real calcular (real v1){
	real fatia, resultado
	fatia = 0.10
	resultado = v1*fatia
		retorne resultado
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */