# Faça um programa em Python que receba 6 numeros inteiros e mostre: ´
#  • Os numeros pares digitados; 
#  • A soma dos numeros pares digitados; 
#  • Os numeros   ımpares digitados;
#  • A quantidade de numeros  ımpares 

numeros_pares = []
numeros_impares = []

soma_pares = 0

for i in range(6):
    numero = int(input("Digite o {}º número inteiro: ".format(i + 1)))
    
    if numero % 2 == 0:
        numeros_pares.append(numero)
        soma_pares += numero
    else:
        numeros_impares.append(numero)


print("\nNúmeros pares digitados:", numeros_pares)
print("Soma dos números pares:", soma_pares)
print("Números ímpares digitados:", numeros_impares)
print("Quantidade de números ímpares:", len(numeros_impares))