programa
{
	
	funcao inicio()
	{
		cadeia nome, continue
		real media
		caracter situacao 

		faca{
		escreva("Digite o Nome do Aluno:","\n")
		leia (nome)
			faca{
			escreva("Qual foi a média?","\n")
			leia(media)
			}
			enquanto(media <=0 ou media > 10)
		escreva("Situacao? ")
		leia(situacao)
		escreva("Cadastrar novo aluno ?(s/S)")
		leia(continue)}
		enquanto(continue == "s" ou continue == "S")
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */