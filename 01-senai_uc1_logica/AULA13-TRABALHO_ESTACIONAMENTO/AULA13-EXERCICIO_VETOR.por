programa
{
	
	funcao inicio()
	{
		inteiro numero , vetor[] = {5,8,10,40,60,90,12,30,25,18}
		escreva("Digite o número que deseja alterar:","\n")
		leia(numero)
		trocar_numero(vetor,numero)
		imprime(vetor)
	}


	funcao trocar_numero(inteiro &vetor[], inteiro num){
		
		vetor [9] = num
		
	}


	funcao imprime(inteiro vetor[]){
		para(inteiro i=0;i<10;i++){
			escreva(vetor [i],"\t")
			
			
			}
		
		
		}



}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */