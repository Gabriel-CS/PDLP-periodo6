package org.example;

import java.util.Locale;
import java.util.Scanner;

/* # Faça um programa que receba 6 numeros inteiros e mostre: ´
#  • Os numeros pares digitados;
#  • A soma dos numeros pares digitados;
#  • Os numeros   ımpares digitados;
#  • A quantidade de numeros  ımpares  */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor;
        vetor = new int[6];
        int qtdImpar = 0, somaNumsPar = 0;

        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("• Números pares digitados: ");
        for(int n : vetor){
            if(n % 2 == 0){
                System.out.print(" " + n + ", ");
                somaNumsPar += n;
            }
        }
        System.out.println();
        System.out.println("• Soma dos números pares: " + somaNumsPar);
        System.out.print("• Números ímpares digitados: ");
        for(int n : vetor){
            if(n % 2 == 1){
                System.out.print(" " + n + ", ");
                qtdImpar++;
            }
        }
        System.out.println();
        System.out.println("• Quantidade de numeros ímpares: " + qtdImpar);

        sc.close();
    }
}