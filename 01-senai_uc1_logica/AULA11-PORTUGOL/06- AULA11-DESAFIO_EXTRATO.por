programa
{
	
	funcao inicio()
	{
	cadeia nome[3]
	real valor[3],subtotal[3],soma=0.0
	inteiro qtd[3]

	para (inteiro i=0;i<3;i++){
	escreva("Digite o Nome:","\n")
	leia(nome[i])
	escreva("Digite o valor:","\n")
	leia(valor[i])
	escreva("Digite a quantidade:","\n")
	leia(qtd[i])
	subtotal[i]=valor[i]*qtd[i]
	soma = soma + subtotal[i]
	limpa()		
	}

	escreva("----Extrato----","\n")
	
	para (inteiro b=0;b<3;b++){
	escreva("Produto:",nome[b],"\n")
	escreva("Valor Unitario: R$",valor[b],"\n")	
	escreva("Quantidade:",qtd[b],"\n")
	escreva("Subtotal: R$",subtotal[b],"\n")
	escreva("-----------------","\n")	
	}
	escreva("Total Geral: R$",soma)
	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */