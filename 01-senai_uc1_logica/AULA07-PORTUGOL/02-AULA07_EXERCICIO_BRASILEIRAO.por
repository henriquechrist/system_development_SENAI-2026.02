programa {
  funcao inicio() {
    cadeia times[8],campeao="",lanterna=""
    inteiro pontuacao[8], maior_pontuacao=0,meno_pontuacao=100
    escreva("BRASILEIRÃO 2027")

    para(inteiro i=0;i<8;i++){
      escreva("Nome do time: ","\n")

      leia(times[i])

      escreva("Pontuação:","\n")

      limpa()

      leia(pontuacao[i])

        se(pontuacao[i]>maior_pontuacao){

          maior_pontuacao=pontuacao[i]
          campeao=times[i]

        }
        se(pontuacao[i]<meno_pontuacao){
        
          meno_pontuacao=pontuacao[i]
          lanterna=times[i]

        }
        senao{}
      
      
      }
      escreva("O Time Campeão foi: ",campeao," com ",maior_pontuacao," pontos","\n")
      escreva("O Time lanterna foi: ",lanterna," com ",meno_pontuacao," pontos","\n")


  }
}
