package DesafioVetor;

import java.util.Scanner;

public class Desafio_6 
{
	public static void main(String[] args) 
	{
	//Crie um método que receba um vetor de inteiros como parâmetro e retorne o maior valor contido nele.
	
		Scanner teclado = new Scanner(System.in);
		int numeros = teclado.nextInt();
		int vetor[] = new int [numeros];
		int maiorValor = 0;
		
		for(int lop = 0; lop < numeros; lop++)
		{
			vetor [lop] = teclado.nextInt();
		}
		
		for(int lop = 0; lop < numeros; lop++)
		{
			if(vetor[lop] >= maiorValor)
			{
				maiorValor = vetor[lop];
				System.out.println(maiorValor);
			}
		}
		teclado.close();
		
		
	}

}
