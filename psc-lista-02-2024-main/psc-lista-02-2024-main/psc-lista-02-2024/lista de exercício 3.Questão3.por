programa {
  funcao inicio() {

    cadeia  nome
     real primeiroB, segundoB, terceiroB, quartoB, media
        escreva(" Qual é o seu nome completo? ")
        leia(nome)

        escreva( "Digite a sua primeira nota do bimestre")
        leia(primeiroB)

        escreva("Digite a sua segunda nota do bimestre ")
        leia (segundoB)

        escreva("Digite a sua terceira nota do bimestre")
        leia(terceiroB)

        escreva( "Digite a sua quarta nota do bimestre")
        leia(quartoB)

        media = ( primeiroB +  segundoB + terceiroB + quartoB )/ 4

        escreva( nome + " o resultado da sua média dos quatro bimestre foi : " + media)
   }

  

}
