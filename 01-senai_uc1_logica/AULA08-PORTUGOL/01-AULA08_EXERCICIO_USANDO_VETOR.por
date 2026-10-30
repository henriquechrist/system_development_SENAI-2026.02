programa {
  funcao inicio() {
    inteiro numeros [5], quant_pares=0,  quant_impares=0
    para (inteiro i=0; i<5; i++){
    escreva("Digite os números: ")
    leia(numeros[i])
    limpa()
    se (numeros[i] % 2 == 0){
    quant_pares++
    }
    senao{
      quant_impares++
    }    
    }
    escreva("Pares: ",quant_pares,"\n","Impares: ",quant_impares)


  }
}
