programa {
  funcao inicio() {
    cadeia matriz[2][3]
    para(inteiro linha=0;linha<2;linha++){
        para(inteiro coluna=0;coluna<3;coluna++){
          se (coluna==0){
            escreva("Digite o nome: ")
          }
          se (coluna==1){
            escreva("Digite o nº do telefone: ")
          }
          se(coluna==2){
            escreva("Digite o email:")
          }
          leia(matriz[linha][coluna])
          limpa()
        }
        } 
          escreva("👤 Lista de Usuários:","\n")
          
          para(inteiro linha=0;linha<2;linha++){
          para(inteiro coluna=0;coluna<3;coluna++){
         
          escreva(matriz[linha][coluna],"\t")
        }   

           escreva("\n")

        }
}
}