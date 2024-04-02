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
import java.util.Random;

public class NumeroSecreto {
    private int numeroAleatorio;

    public NumeroSecreto() {
        this.numeroAleatorio = -1;
    }

    public void sortear() {
        // Gera um número aleatório entre 0 e 100
        this.numeroAleatorio = (int) Math.round(Math.random() * 100);
    }

    public int adivinhar(int palpite) {
        if (numeroAleatorio == -1) {
            // Se o número não foi sorteado ainda, retorna -2
            return -2;
        } else if (palpite < numeroAleatorio) {
            // Se o palpite for menor que o número aleatório, retorna -1
            return -1;
        } else if (palpite > numeroAleatorio) {
            // Se o palpite for maior que o número aleatório, retorna 1
            return 1;
        } else {
            // Se o palpite for igual ao número aleatório, retorna 0
            return 0;
        }
    }
}
