package main

import (
	"fmt"
)

func main() {

	var vetor [10]int

	fmt.Println("Digite 10 valores para o vetor:")

	for i := 0; i < 10; i++ {
		fmt.Printf("Digite o valor para a posição %d: ", i)
		fmt.Scan(&vetor[i])
	}

	maior := vetor[0]
	menor := vetor[0]

	for i := 1; i < 10; i++ {
		if vetor[i] > maior {
			maior = vetor[i]
		}
		if vetor[i] < menor {
			menor = vetor[i]
		}
	}
	
	fmt.Printf("O maior elemento do vetor é: %d\n", maior)
	fmt.Printf("O menor elemento do vetor é: %d\n", menor)
}
