package org.example;

import java.util.Locale;
import java.util.Scanner;

/* Leia um vetor de 8 posições e, em seguida, lê dois vetores X e Y qualquer correspondente a duas posições
 do vetor. O programa então imprime a soma dos valores encontrados nas respectivas posições X e Y.  */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor;

        vetor = new int[8];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        if(x >= 8 || x < 0){
            System.out.print("X maior/menor que o tamanho do vetor, tente novamente com um número entre 0 à 7: ");
            x = sc.nextInt();
        }
        if(y>= 8 || y < 0){
            System.out.print("Y maior/menor que o tamanho do vetor, tente novamente com um número entre 0 à 7: ");
            y = sc.nextInt();
        }


        System.out.println("X + Y = " + (vetor[x] + vetor[y]));

        sc.close();
    }
}