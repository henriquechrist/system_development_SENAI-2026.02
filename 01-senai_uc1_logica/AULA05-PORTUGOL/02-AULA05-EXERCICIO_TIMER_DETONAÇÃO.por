programa {
  inclua biblioteca Util --> u
  funcao inicio() {
    inteiro contador = 10
    inteiro senha = 0
    escreva("Bomba Acionada","\n")
    enquanto (contador>0  e  senha != 1234){
      contador =contador -1
      escreva("Contando:.💣.:",contador,"\n")
      u.aguarde(1000)
      limpa()
      escreva("Digite a senha de desativação:  ","\n")
      leia(senha)

    }
    se ( senha == 1234 )
    {escreva("💥💥EXPLODIU CONFETE!!💥💥")}
    senao
    escreva("💥💥BOOOM!💥💥")



  }
}
