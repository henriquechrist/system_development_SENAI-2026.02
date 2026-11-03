programa
{
	
	funcao inicio()
{
	escreva ("Olá Mundo","\n")
			entrada_dados()
	}

	funcao entrada_dados(){
	cadeia empresa
	inteiro ano

	escreva ("Digite o ano do curso:","\n")
		leia(ano)
			escreva ("Digite o nome da empresa:","\n")
				leia(empresa)
					limpa()	
						mensagem(ano,empresa)
						
		
	}

	
	funcao mensagem(inteiro ano, cadeia empresa){
	escreva ("**********","\n")
		escreva ("***-",empresa,"-***","\n")
			escreva ("**-", ano,"-**","\n")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */