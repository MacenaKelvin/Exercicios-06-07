package br.com.generation.exercicios.mv;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int[] arrayVetor = new int[10];
		int i, maior = 0,  soma = 0;
		double media = 0.0;
		int cont = 0;
		for (i = 0; i < arrayVetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º lançamento: ");
			arrayVetor[i] = ler.nextInt();
			soma += arrayVetor[i];
			media = soma/5;
			
			if (arrayVetor[i] > maior ) {
				maior = arrayVetor[i];
				cont = 0; 
			}
			if (arrayVetor[i] == maior) {
				
				cont++;
			}
		}
		System.out.println("\nA média dos lançamentos é: " + media);
		System.out.println("O maior valor foi lançado: " + cont + " vezes" );
		
	}	

	}


