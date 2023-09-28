package main

import (
	"fmt"
)

func main() {

	var A [10]int
	var B [10]int

	fmt.Println("Digite 10 valores para o vetor A:")
	for i := 0; i < 10; i++ {
		fmt.Printf("Digite o valor para a posição %d: ", i)
		fmt.Scan(&A[i])
	}

	fmt.Println("Digite 10 valores para o vetor B:")
	for i := 0; i < 10; i++ {
		fmt.Printf("Digite o valor para a posição %d: ", i)
		fmt.Scan(&B[i])
	}

	var C [10]int
	for i := 0; i < 10; i++ {
		C[i] = A[i] - B[i]
	}

	fmt.Println("Vetor C = A - B:")
	for i := 0; i < 10; i++ {
		fmt.Printf("C[%d] = %d\n", i, C[i])
	}
}
