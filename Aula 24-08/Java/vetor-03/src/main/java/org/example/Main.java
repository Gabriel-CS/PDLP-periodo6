package org.example;

/* Faça um programa que receba do usuario dois vetores, ´ A e B, com 10 numeros inteiros cada. Crie um novo
 vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C. */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetorA, vetorB, vetorC;
        vetorA = new int[10];
        vetorB = new int[10];
        vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Digite o valor do vetor A: ");
            vetorA[i] = sc.nextInt();
            System.out.print("Digite o valor do vetor B: ");
            vetorB[i] = sc.nextInt();

            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println();
        System.out.println("Resultado da soma do vetor A + vetor B: ");
        for(int j=0; j<vetorC.length; j++){
            System.out.print(" " + vetorC[j] + ", ");
        }

        sc.close();
    }
}