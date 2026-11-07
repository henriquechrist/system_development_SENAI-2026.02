//Trabalho em grupo - Henrique Christ e Yago Oliveira

programa
{
	//Parâmetro global e importação de biblioteca
	inclua biblioteca Util
	inteiro assentos [10][12]


	//Função de início serve para orquestrar o fluxo principal
	funcao inicio()
	{
	
	escreva("Bem-vindo ao Cinema Senai!","\n")
	timer()
	escreva("Qual posição do assento você deseja:","\n")
	iniciar()
	reservar()

	}	
	
	//Função para deixar o " 0 " como padrão em todos os assentos
	funcao iniciar(){
		para (inteiro linha=0;linha<10;linha++){
				para (inteiro coluna=0;coluna<12;coluna++){
					assentos[linha][coluna]=0
					escreva(assentos[linha][coluna],"\t")
				}
				escreva("\n")
		}
	}

	//Função para fazer a reserva do assento
	funcao reservar(){
				inteiro cadeira, fileira
				cadeia repetir
				faca{
					escreva("Digite a fileira e o assento:","\n")
					leia(cadeira,fileira)
						
						//Utilizando o Se para impedir o usuário de inserir uma posição inválida
						se (cadeira>10 ou fileira>12){
						escreva("Posição Inválida","\n")
						escreva("Reiniciando...","\n")
						timer()
						reservar()}			
					
						se (assentos[cadeira][fileira]==0){
						assentos [cadeira][fileira]=1	
						escreva("Cadeira Reservada!","\n")
						imprimir_cadeira()
						timer()
						escreva("Repetir?  (S/s)","\n")
						leia(repetir)
				
						} 
						senao {
						escreva("Esta cadeira já está reservada","\n")
						Util.aguarde(2000)
						limpa()
						escreva("Digite a fileira e o assento:")
						leia(cadeira)
						leia (fileira)
						imprimir_cadeira()
						timer()
						escreva("Repetir? (S/s)","\n")
						leia(repetir)
						}
						
				}
				 enquanto(repetir=="S" ou repetir=="s")
	}

	
	//Função para padronizar a limpeza do código
	funcao timer(){
		Util.aguarde(2000)
		limpa()
	}

	
	//Função para imprimir cadeiras ocupadas
	funcao imprimir_cadeira(){
		para (inteiro linha=0;linha<10;linha++){
			para (inteiro coluna=0;coluna<12;coluna++){
					escreva(assentos[linha][coluna],"\t")
				}
				escreva("\n")
		}
	}

	
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */