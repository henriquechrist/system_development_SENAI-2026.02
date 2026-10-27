programa {
  funcao inicio() {
    real n1,n2,md
    inteiro ft

    escreva("Insira a primeira nota:","\n")
    leia(n1)
    escreva("Insira a segunda nota:","\n")
    leia(n2)
    escreva("Faltou quantas vezes:","\n")
    leia(ft)
    
    md=((n1+n2)/2)

    se(ft>=4){
      escreva("Reprovado por faltas")
    }senao se(md>=9){
      escreva("Aprovado com excelência")
    }senao se  (md>=7)
      escreva("Aprovado")
  senao{
    escreva("Reprovado por nota")
    } 
    
    
  }
}
