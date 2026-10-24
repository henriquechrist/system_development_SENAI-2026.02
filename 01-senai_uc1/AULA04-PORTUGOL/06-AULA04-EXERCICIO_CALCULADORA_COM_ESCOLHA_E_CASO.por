programa {
  funcao inicio() {
    real n1 , n2
    caracter op
    
  escreva("digite o primeiro numero:","\n")
  leia(n1)
  escreva("escolha a operação (+ - / *):","\n")
  leia(op)
  escreva("digite o segundo numero:","\n")
  leia(n2)

  escolha(op){
    caso '+':
      escreva("Resultado: ", n1+n2)
    pare
     caso '-':
      escreva("Resultado: ", n1+n2)
    pare
     caso '*':
      escreva("Resultado: ", n1+n2)
    pare
     caso '/':
      escreva("Resultado: ", n1+n2)
    pare
  }


  }
}
