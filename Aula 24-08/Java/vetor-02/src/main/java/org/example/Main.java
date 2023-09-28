package org.example;

import java.util.Locale;
import java.util.Scanner;

/* Faça um programa em Python que receba do usuário um vetor com 10 posições. Em seguida deverá ser
 impresso o maior e o menor elemento do vetor. */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor;
        vetor = new int[10];

        int maiorValor = -99999;
        int menorValor = 99999;

        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }

        System.out.println();
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);

        sc.close();
    }
}