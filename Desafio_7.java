package DesafioVetor;

import java.util.Arrays;

public class Desafio_7 
{
	public static void main(String[] args) 
	{
	//Crie um método que receba dois vetores de inteiros como parâmetro e retorne um
	//terceiro vetor contendo a soma dos elementos correspondentes de cada um.
		
		int vetor1 [] = new int [3];
		
		vetor1[0]= 10;
		vetor1[1]= 20;
		vetor1[2]= vetor1[0] + vetor1[1];
		
		for(int lop = 0; lop < vetor1.length; lop++)
		{
			System.out.println(Arrays.toString(vetor1));
		}
		
		
		
		
		
		
		
		
	}
	

}
