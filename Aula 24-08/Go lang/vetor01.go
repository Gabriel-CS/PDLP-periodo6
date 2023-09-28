package main

import (
	"fmt"
)

func main() {

	var vetor [8]int

	fmt.Println("Digite 8 valores para o vetor:")
	for i := 0; i < 8; i++ {
		fmt.Printf("Digite o valor para a posição %d: ", i)
		fmt.Scan(&vetor[i])
	}

	var x, y int
	fmt.Print("Digite o valor de X: ")
	fmt.Scan(&x)
	fmt.Print("Digite o valor de Y: ")
	fmt.Scan(&y)

	if x >= 0 && x < 8 && y >= 0 && y < 8 {
		soma := vetor[x] + vetor[y]
		fmt.Printf("A soma dos valores nas posições %d e %d é %d\n", x, y, soma)
	} else {
		fmt.Println("Índices X e Y devem estar entre 0 e 7.")
	}
}
