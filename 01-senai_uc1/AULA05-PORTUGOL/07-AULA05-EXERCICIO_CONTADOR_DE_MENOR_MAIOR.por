programa {
  funcao inicio() {
    inteiro id,maior=0 ,menor=0
     faca {
      escreva("Qual a sua idade?","\n")
      leia(id)
      se(id>=18){
      maior = maior+1
      escreva("Maior de Idade","\n")}
      senao 
      {menor = menor +1
      escreva("Menor de Idade","\n")}
      
      }
      enquanto(id>0)
      menor=menor-1
      escreva("São ",menor," menores e ", maior," maiores!")
  }
}
