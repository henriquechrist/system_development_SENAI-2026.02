//TRABALHO SENAI PARK - HENRIQUE CHRIST, YAGO DE OLIVEIRA, PABLO BRANDÃO
programa
{

// IMPORTAÇÕES E MATRIZ GERAL

inclua biblioteca Util	
cadeia vagas[30]

	//FUNÇÃO START DO SISTEMA
	funcao inicio(){
		
	escreva("Sistema Senai Park\n")
	escreva("Vagas disponiveis:\n")
	criar_vagas()
	entrada_vagas()
	
	}
	
	//FUNÇÃO QUE CRIA AS 30 VAGAS E ATRIBUI O VALOR CORREPONDENTE A SUA POSIÇÃO
	funcao criar_vagas(){
		
			para (inteiro v=0;v<30;v++){
				vagas[v]="DISP"
				escreva(vagas[v],"\t")
			}
	escreva("\n")
	}

	//FUNÇÃO PARA LOOPING DE SISTEMA, SO ENCERRA DIGITANDO ALGUM CARCTER != DE "s"
	funcao entrada_vagas(){
		
		inteiro vaga
		cadeia decida,placa
		
		escreva("Digite a vaga escolhida:\n")
		leia(vaga)
		escreva("Digite a placa do veículo:\n")
		leia(placa)
		vaga_placa(placa)
			
			se(vagas[vaga] !="DISP"){
				escreva("Vaga já ocupada!","\n")
				imprimir_vagas()
				tempo()
				entrada_vagas()

			}
			
				se(vaga>=0 ou vaga<=29){
				vagas[vaga] = placa
				tempo()
				escreva("Placa  ",placa," registrada na vaga ",vaga,"!\n")
				imprimir_vagas()
				tempo()
				escreva("Reservar outra vaga? (s/n) \n")
				leia(decida)
				
					se(decida=="s"){
					entrada_vagas()
					} 
					
						senao{
							escreva("Sistema Finalizado","\n")
					 
							}
		
				}
							senao{
								escreva("Vaga ocupada,escolha outra:\n")
								leia(vaga)
								escreva("Digite a placa: \n")
								leia(placa)
								vaga_placa(placa)
								vagas[vaga]=placa
								imprimir_vagas()
								tempo()
								escreva("Reservar outra vaga? (s/n) \n")
								leia(decida)
									
									se(decida=="s"){
										entrada_vagas()
									}
					 				
					 				senao{
										escreva("Sistema Finalizado","\n")
					 
										}		
				
								}
			
	}

	//FUNÇÃO PARA IMPRIMIR VAGAS OCUPADAS
	funcao imprimir_vagas(){
		para(inteiro vv=0;vv<30;vv++){
			escreva(" ",vagas[vv],"\t")
		}
	}
	
	//FUNÇÃO PARA TIMER E LIMPAR CÓDIGO
	funcao tempo(){
		Util.aguarde(3500)
		limpa()
		}

	
	//FUNÇÃO PARA VERIFICAR SE A PLACA JA FOI CADASTRADA
	funcao vaga_placa(cadeia pl1){
		para(inteiro vvv=0;vvv<30;vvv++){
			se (vagas[vvv] == pl1){
				escreva("Placa já cadastrada na vaga: ",vagas[vvv])
				tempo()
				entrada_vagas()
		}
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */