programa {
  funcao inicio() {
    cadeia nome="Fulano"
    inteiro idade 
    real altura
    logico ativo=verdadeiro
    caracter vale_transporte = 'N'
    const cadeia lotacao = "Rio de Janeiro"


    escreva("Olá ",nome,"\n")
    escreva("Digite seu nome:")
    leia(nome)
    escreva("Seu nome é ", nome,"\n")

    escreva("Digite sua idade:")
    leia(idade) 
    escreva("Sua idade é ", idade,"\n") 

    escreva("Digite sua altura:")
    leia(altura) 
    escreva("Sua altura é ", altura,"\n")

    escreva("Dados do funcionário: ","\n", "Nome: ", nome,"\n", "Idade: ", idade,"\n","Altura ", altura,"\n","Ativo: ", ativo,"\n","VT: ", vale_transporte,"\n",lotacao)
  }
}
