package DesafioVetor;


public class Desafio_10 
{
	
	public static void main(String[] args) 
	{
	//-Crie um método que receba um vetor de inteiros como parâmetro e
	//ordene seus elementos em ordem crescente.

        int[] vetor = {5, 8, 1, 3, 9, 2};
        
        // Ordenando do maior para o menor
        ordenador(vetor, true);
        System.out.println("Ordenado do maior para o menor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        // Ordenando do menor para o maior
        ordenador(vetor, false);
        System.out.println("\nOrdenado do menor para o maior: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

	 public static void ordenador(int[] numeros, boolean ordemDecrescente) 
	 {
	        int n = numeros.length;
	        
	        for (int i = 0; i < n - 1; i++) 
	        {
	            for (int j = 0; j < n - i - 1; j++) 
	            {
	                if (ordemDecrescente) 
	                {
	                    if (numeros[j] < numeros[j + 1]) 
	                    {
	                        int temp = numeros[j];
	                        numeros[j] = numeros[j + 1];
	                        numeros[j + 1] = temp;
	                    }
	                } 
	                else 
	                {
	                    if (numeros[j] > numeros[j + 1]) 
	                    {
	                        int temp = numeros[j];
	                        numeros[j] = numeros[j + 1];
	                        numeros[j + 1] = temp;
	                    }
	                }
	            }
	        }
	    }
	}