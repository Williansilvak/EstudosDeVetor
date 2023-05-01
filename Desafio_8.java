package DesafioVetor;

public class Desafio_8 
{
	public static void main(String[] args) 
	{
	//crie um método que receba um vetor de inteiros como parâmetro e retorne um novo vetor contendo apenas os valores pares.
		
		int pares [] = {1,2,3,4,5,6,7,8,9,10};
		int contador = 0;
		
		for(int i = 0; i < pares.length; i++)
		{
			if(pares[i] % 2 == 0)
			{
				pares[contador] = pares[i];
				System.out.println(pares[contador]);
			}
		}
		
		
	}

}
