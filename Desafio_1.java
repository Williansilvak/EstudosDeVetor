package DesafioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_1 {

    public static void main(String[] args) {

        int tamanho = 5;
        int[] vetor = new int[tamanho];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor da posicao %d do vetor: ", i);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Valores do vetor: " + Arrays.toString(vetor));

        sc.close();

    }

}