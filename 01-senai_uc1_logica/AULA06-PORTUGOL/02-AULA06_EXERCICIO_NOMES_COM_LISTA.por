programa {
  funcao inicio() {
    cadeia nomes[5]
    inteiro  contador=0
    escreva("Lista de convidados","\n")

    para(inteiro i=0;i<5;i++){
      escreva("Digite o nome:")
      leia(nomes[ i ])
      escreva(nomes[i],"\n")
      contador=contador+1
    }
    limpa()
    escreva("Fim do Programa, ",contador," nomes!")

  }
}
