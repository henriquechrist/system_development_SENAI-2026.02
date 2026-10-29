programa {
  funcao inicio() {
    real nota,soma=0.0, maior, menor, md=0.0
    para (inteiro i = 1; i <= 5; i++){
      faca{
      escreva("Digite a ",i,"ª nota:")
      leia(nota)}
        enquanto(nota<=11 ou nota<=0)
      soma=soma+nota
       limpa()
      se(i==1)
      maior=nota
      menor=nota
        se(nota>maior){
          maior=nota
        }senao
         se(nota<menor){
         menor=nota}
         
      }
    md=soma/5
    escreva("Calculadora","\n")
    escreva("A Maior nota é:", maior,"\n")
    escreva("A Menor nota é:", menor,"\n")
    escreva("A Média é: ",md)
      


  }
}
