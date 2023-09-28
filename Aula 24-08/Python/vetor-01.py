# Leia um vetor de 8 posições e, em seguida, lê dois vetores X e Y qualquer correspondente a duas posições
# do vetor. O programa então imprime a soma dos valores encontrados nas respectivas posições X e Y.

def main():
  vetor = [0] * 8

  for i in range(8):
    vetor[i] = int(input("Digite o valor da posição {}: ".format(i)))

  x = int(input("Digite o valor de X: "))
  y = int(input("Digite o valor de Y: "))

  if(x < len(vetor) or x > len(vetor)):
    print("Valor de x maior que o vetor!")
    x = int(input("Insira novamente um número do tamanho do vetor: "))

  if(y < len(vetor) or y > len(vetor)):
    print("Valor de y maior que o vetor!")
    x = int(input("Insira novamente um número do tamanho do vetor: "))

  soma = vetor[x] + vetor[y]

  print("A soma dos valores nas posições X e Y é {}.".format(soma))

if __name__ == "__main__":
  main()