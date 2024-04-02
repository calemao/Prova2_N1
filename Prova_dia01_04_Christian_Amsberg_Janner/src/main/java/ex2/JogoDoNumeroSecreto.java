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

package ex2;

/**
 *
 *@author1 Christian Amsberg Janner <janner.chris15@outlook.com>
 *@author2 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 */
import java.util.Scanner;

public class JogoDoNumeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroSecreto numeroSecreto = new NumeroSecreto();

        // Sorteia o número aleatório
        numeroSecreto.sortear();

        System.out.println("Bem-vindo ao Jogo do Número Secreto!");

        int palpite;
        int resultado = 0;

        // Loop até o usuário adivinhar o número
        do {
            System.out.println("Digite o seu palpite (de 0 a 100):");
            palpite = scanner.nextInt();

            // Verifica se o palpite é válido
            if (palpite < 0 || palpite > 100) {
                System.out.println("Palpite inválido! Por favor, digite um número entre 0 e 100.");
                continue;
            }

            // Realiza a adivinhação e exibe o resultado
            resultado = numeroSecreto.adivinhar(palpite);
            if (resultado == -2) {
                System.out.println("Número não sorteado ainda!");
            } else if (resultado == -1) {
                System.out.println("Palpite é menor que o número secreto!");
            } else if (resultado == 1) {
                System.out.println("Palpite é maior que o número secreto!");
            } else {
                System.out.println("Parabéns! Você adivinhou o número secreto!");
            }
        } while (resultado != 0);

        scanner.close();
    }
}
