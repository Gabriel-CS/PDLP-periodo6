# Faça um programa que solicite o preço de uma mercadoria e o percentual do desconto. Exiba o valor do desconto e o preço a pagar.

def calcularDesconto(preco, percentual):
  valorDesconto = preco * percentual / 100
  valorFinal = preco - valorDesconto
  print("Valor de desconto: ", valorDesconto)
  print("Preço a pagar: ", valorFinal)

preco = float(input("Preço da mercadoria (R$): "))
percentual = float(input("Percentual de dosconto: "))

calcularDesconto(preco, percentual)