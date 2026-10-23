programa {
  funcao inicio() {
    const real valor = 80.00
    real largura,comprimento,area,preco

    escreva("Calculadora de Metro Quadrado de Terrenos","\n")
    escreva("Quantos metros tem a largura tem seu terreno:","\n")
    leia(largura)

    escreva("Quantos metros tem o comprimento so seu terreno: ","\n")
    leia(comprimento)

    area=largura*comprimento
    preco=area*valor
    
    escreva("Seu terreno tem área de: ",area," m² e vale R$ ",preco)
  }
}
