programa {
  funcao inicio() {
    inteiro n1,somador=0,contador=0
    cadeia decida

      faca{
          escreva("Digite o Número:","\n")
          leia(n1)
          somador= somador+n1
          contador=contador+1
          escreva("Mais um Número? (S/N)","\n")
          leia(decida)
          limpa()
          }
          enquanto(decida=="S")
          escreva("Sua soma é: ", somador,"\n", "No total de: " , contador ," números")

      }




  }

