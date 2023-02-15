package exerciciosVetoresMatriz;

import java.util.Scanner;

public class exerc4Matriz {
    public static void main(String[] args) {
        double[][] notas = new double[10][4];//10 linhas para 10 alunos 4 colunas para as 4 notas de cada aluno
        double[] medias = new double[10];// 10 linhas para a media dos 10 alunos
        Scanner scanner = new Scanner(System.in);

        // Lendo as notas dos participantes
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite as notas do participante %d:\n", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("Nota do %dº bimestre: ", j + 1);
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calculando as médias dos participantes
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }

        // Exibindo as médias dos participantes
        System.out.println("Médias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.2f\n", i + 1, medias[i]);
        }
    }
}
