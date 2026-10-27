programa {
  funcao inicio() {
    real n1 , n2
    cadeia op
    
  escreva("digite o primeiro numero:","\n")
  leia(n1)
  escreva("escolha a operação (+ - / *):","\n")
  leia(op)
  escreva("digite o segundo numero:","\n")
  leia(n2)

  se(op == "+"){
    escreva(n1," ",op," ",n2,"= ",(n1+n2))}
  se(op == "-"){
    escreva(n1," ",op," ",n2,"= ",(n1-n2))}
  se(op == "/"){
    escreva(n1," ",op," ",n2,"= ",(n1/n2))}
  se(op == "*"){
    escreva(n1," ",op," ",n2,"= ",(n1*n2))}
  senao(escreva("operação inválida"))
  
  


  }
}
