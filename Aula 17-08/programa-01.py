#Objetivo: fazer a leitura de duas notas e calcular sua média

n1 = float(input("Informe a nota 1: "))
n2 = float(input("Informe a nota 2: "))

med = (n2 + n1)/2

print("Média final: ", med)


# Utilizando modularização (utiliza-se funções e pricedimentos).

def media(n1, n2):
  print("Média final:", (n1 + n2)/2)

n1 = float(input("Informe a nota 1: "))
n2 = float(input("Informe a nota 2: "))

media(n1, n2)