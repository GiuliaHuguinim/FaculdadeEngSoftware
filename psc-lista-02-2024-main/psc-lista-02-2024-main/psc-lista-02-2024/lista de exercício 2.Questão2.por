programa {
  funcao inicio()
   {
    real numero1, numero2
    escreva ("Digite o primeiro número")
    leia (numero1)

    escreva (" digite o segundo número ")
    leia (numero2)

    escreva("a soma é: ", soma(numero1, numero2), "\n")

    escreva ("sua subtração é: ", subtracao(numero1, numero2), "\n")

    escreva( "sua multiplicação é: ", multiplicacao(numero1, numero2), "\n")
  }

  funcao real soma ( real numero1, real numero2)
  { 
    real resultado = numero1 + numero2
    retorne resultado
  }

  funcao real subtracao(real numero1, real numero2)
  {
    real resultado = numero1 - numero2
    retorne resultado

  }
  funcao real multiplicacao ( real numero1, real numero2)
  {
    real resultado = numero1 * numero2
    retorne resultado
  }
}
