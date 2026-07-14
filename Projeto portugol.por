programa {
  funcao inicio() {

    real saldo_atual = 0.00
    inteiro op = 0
    real saque
    real deposito

    faca{
      
      escreva("1 - Consultar saldo \n")
      escreva("2 - Depositar dinheiro \n" )
      escreva("3 - Sacar dinheiro \n")
      escreva("4 - Sair \n")
      escreva("Informe a opção: ")
      leia(op)

      escolha(op){

      caso 1:
      escreva("saldo atual R$: " + saldo_atual + "\n")
      pare

      caso 2:
      escreva("Informe o valor a ser depositado: ")
      leia(deposito)
      saldo_atual = saldo_atual + deposito
      pare

      caso 3:
      escreva("Informe o valor a ser sacado: ")
      leia(saque)

      se(saque > saldo_atual){
      escreva("Valor insuficiente! \n")
      }senao{
      escreva("ok\n")
      saldo_atual = saldo_atual - saque
      }
      pare

      caso 4:
      para(inteiro i = 2 ; i>0;i--){
      escreva("Encerrando o sistema... \n")
      }
      pare

      caso contrario:
    escreva("Numero invalido!\n")
    }

    }enquanto(op !=4)
  escreva("Sistema Encerrado!\n")
    
  }
}

