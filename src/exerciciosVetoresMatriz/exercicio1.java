package exerciciosVetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] numero = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int valor, auxiliar=-1;

		System.out.println("Digite um valor que deseja encontrar: ");
		valor = leia.nextInt();

		for (int x = 0; x < numero.length; x++) {
			if (valor == numero[x]) {
				auxiliar =x;

			}
		}

		if(auxiliar != -1) {
			System.out.println("O numero "+ valor +" está localizado na posição: "+auxiliar);
		}else {
			System.out.println("O numero"+valor+ "não foi encontrado!");
		}

	}

}
