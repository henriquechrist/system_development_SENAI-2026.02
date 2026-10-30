programa {

  inclua biblioteca Util

  funcao inicio() {
    inteiro numeros[3][2],soma=0,soma_linha=0

    para(inteiro linha=0;linha<3;linha++){
      soma_linha=0
      escreva("Vamos Somar?","\n")  

        para(inteiro coluna=0;coluna<2;coluna++){
        escreva("Digite os Valores:")
        leia(numeros[linha][coluna])
        soma=soma + numeros[linha][coluna]
        soma_linha=soma_linha + numeros [linha] [coluna]       
        }
        
        escreva("Total da linha ",linha,": ",soma_linha,"\n")
        Util.aguarde(1000)
        limpa()
    }
        escreva("Total da Soma:",soma)
  
  }
}
