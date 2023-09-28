package main

import (
	"fmt"
)

func main() {

	var numero, somaPares, quantidadeImpares int
	var pares []int
	var impares []int


	for i := 1; i <= 6; i++ {
		fmt.Printf("Digite o %dº número inteiro: ", i)
		fmt.Scan(&numero)

		if numero%2 == 0 {
			pares = append(pares, numero)
			somaPares += numero
		} else {
			impares = append(impares, numero)
			quantidadeImpares++
		}
	}

	fmt.Println("Números pares digitados:", pares)
	fmt.Println("Soma dos números pares digitados:", somaPares)
	fmt.Println("Números ímpares digitados:", impares)
	fmt.Println("Quantidade de números ímpares digitados:", quantidadeImpares)
}
