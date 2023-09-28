# Faça um programa em Python que receba do usuario dois vetores, ´ A e B, com 10 numeros inteiros cada. Crie um novo vetor denominado C 
# calculando C = A - B. Mostre na tela os dados do vetor C.

A = []
B = []

print("Digite os 10 elementos do vetor A:")
for i in range(10):
    elemento = int(input("Digite o elemento {}: ".format(i + 1)))
    A.append(elemento)

print("\nDigite os 10 elementos do vetor B:")
for i in range(10):
    elemento = int(input("Digite o elemento {}: ".format(i + 1)))
    B.append(elemento)

C = [A[i] - B[i] for i in range(10)]

print("\nVetor C (A - B):")
for elemento in C:
    print(elemento)
