package DesafioVetor;

public class Desafio_5 
{
	public static void main(String[] args) 
	{
//Crie um método que receba um vetor de inteiros como parâmetro e retorne a soma de todos os seus elementos
		  
		int vetor [] = {1,3,4,5};
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++)
		{
			soma += vetor[i];
			System.out.println(soma);
		}
		
		
		
	}

}
