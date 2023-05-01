package DesafioVetor;

public class Desafio_9 
{
	public static void main(String[] args) 
	{
	//Crie um método que receba um vetor de inteiros como parâmetro e 
	//retorne um novo vetor contendo apenas os valores ímpares.

		int vetor [] =  {1,2,3,4,5,6,7,8,9,10};
		int contador = 0;
		
		for(int lop = 0; lop < vetor.length; lop++)
		{
			if(vetor[lop] % 2 != 0)
			{
				vetor[contador] = vetor[lop];
				System.out.println(vetor[contador]);
				
			}
		}
		
		
	}

}
