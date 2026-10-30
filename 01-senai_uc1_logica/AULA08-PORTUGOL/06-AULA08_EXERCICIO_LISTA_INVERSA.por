programa {
  funcao inicio() {
    inteiro numeros[10],soma=0
    para(inteiro i=0;i<10;i++){
      escreva("Lista de Números","\n")
      escreva("Digite o Nº: ")
      leia(numeros[i])
      soma=soma+numeros[i]
      limpa()
    }
    limpa()
    escreva("Lista em Ordem Inversa a Digitada: ","\n")
        escreva("______________________________________________ ","\n")
    para(inteiro i=9;i>=0;i--){
    escreva(numeros[i],"\t")}

     escreva("\n") 
      escreva("______________________________________________ ","\n")
        escreva("A Soma da Lista em Ordem Inversa a Digitada: ","\n")
          escreva("______________________________________________ ","\n")
            escreva(":::::::::. ",soma," .:::::::::")
  }
}
