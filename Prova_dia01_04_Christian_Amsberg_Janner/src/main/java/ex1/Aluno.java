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

public class Aluno {
    // Variáveis de instância para armazenar as notas do aluno
    private double N1, N2, N3, N4;
    // Variáveis de classe para acompanhar o número total de alunos e a soma das médias de todos os alunos
    private static int numeroDeAlunos = 0;
    private static double somaDeMedidas = 0;

    // Construtor da classe Aluno
    public Aluno(double N1, double N2, double N3, double N4) {
        // Inicializa as notas do aluno com os valores fornecidos
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
        this.N4 = N4;
        // Incrementa o número de alunos
        numeroDeAlunos++;
        // Adiciona a média deste aluno à soma total de médias
        somaDeMedidas += calcularMedia();
    }

    // Método para calcular a média do aluno
    public double calcularMedia() {
        return (N1 * 1 + N2 * 2 + N3 * 3 + N4 * 4) / 10;
    }

    // Método para comparar a média deste aluno com a média de outro aluno
    public int compararMedia(Aluno outroAluno) {
        // Calcula a média deste aluno e a média do outro aluno
        double minhaMedia = this.calcularMedia();
        double mediaDoOutro = outroAluno.calcularMedia();

        // Compara as médias e retorna um valor de acordo com a comparação
        if (minhaMedia < mediaDoOutro) {
            return -1;
        } else if (minhaMedia > mediaDoOutro) {
            return 1;
        } else {
            return 0;
        }
    }

    // Método estático para calcular a média total de todos os alunos
    public static double mediaTotal() {
        return somaDeMedidas / numeroDeAlunos;
    }

    // Método estático para obter o número total de alunos
    public static int getNumeroDeAlunos() {
        return numeroDeAlunos;
    }
}
