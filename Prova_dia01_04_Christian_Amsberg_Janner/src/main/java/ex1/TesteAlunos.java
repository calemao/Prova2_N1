/*
 * Copyright (C) 2024 Christian Amsberg Janner <janner.chris15@outlook.com>
 * Copyright (C) 2024 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex1;

/**
*@author1 Christian Amsberg Janner <janner.chris15@outlook.com>
 *@author2 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 */

import java.util.Scanner;

public class TesteAlunos {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê os dados de 3 alunos e armazena em objetos do tipo Aluno
        Aluno aluno1 = lerAluno(scanner, 1);
        Aluno aluno2 = lerAluno(scanner, 2);
        Aluno aluno3 = lerAluno(scanner, 3);

        // Calcula e exibe a média de cada aluno
        System.out.println("Média do aluno 1: " + aluno1.calcularMedia());
        System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Média do aluno 3: " + aluno3.calcularMedia());

        // Compara as médias dos alunos
        System.out.println("Comparação das médias:");
        System.out.println("Aluno 1 com Aluno 2: " + aluno1.compararMedia(aluno2));
        System.out.println("Aluno 1 com Aluno 3: " + aluno1.compararMedia(aluno3));
        System.out.println("Aluno 2 com Aluno 3: " + aluno2.compararMedia(aluno3));

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }

    // Método auxiliar para ler os dados de um aluno e retornar um objeto Aluno
    private static Aluno lerAluno(Scanner scanner, int numeroAluno) {
        // Solicita ao usuário que digite as notas do aluno
        System.out.println("Digite as notas do aluno igualmente como está no parênteses seguindo essa sequência" + numeroAluno + " (N1 N2 N3 N4):");
        // Lê a linha de entrada do usuário
        String line = scanner.nextLine();
        // Divide a linha em partes separadas usando o espaço como delimitador
        String[] notas = line.split(" ");

        // Converte as strings em números e armazena em variáveis
        double n1 = Double.parseDouble(notas[0]);
        double n2 = Double.parseDouble(notas[1]);
        double n3 = Double.parseDouble(notas[2]);
        double n4 = Double.parseDouble(notas[3]);

        // Retorna um novo objeto Aluno com as notas fornecidas
        return new Aluno(n1, n2, n3, n4);
    }
}
