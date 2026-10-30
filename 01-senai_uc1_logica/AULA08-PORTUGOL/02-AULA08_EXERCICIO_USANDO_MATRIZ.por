programa {
funcao inicio() {
inteiro matriz[3][2] = {{22,10},
                        {30,14},
                        {18,16}}

  para(inteiro linha=0;linha<3;linha++){
  para(inteiro coluna=0; coluna < 2; coluna++){
    escreva(matriz[linha][coluna])
    se(coluna==0){
      escreva(",")
  }
  }
  escreva("\n")
  }
  }
}