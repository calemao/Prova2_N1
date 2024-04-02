/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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


package ex3;

/**
 *@author1 Christian Amsberg Janner <janner.chris15@outlook.com>
 *@author2 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 */
// Definição da classe Movie, que estende a classe Product
public class Movie extends Product {
    
    // Atributo para armazenar o nome do diretor
    private String director;

    // Construtor que inicializa todos os atributos, incluindo o nome do diretor
    public Movie(String director, String name, double price, Integer numberOfCopies) {
        // Chamando o construtor da classe mãe (Product) e passando os parâmetros necessários
        super(name, price, numberOfCopies);
        // Inicializando o atributo específico desta classe (director)
        this.director = director;
    }

    // Construtor padrão
    public Movie() {
       // Não há código aqui, apenas o construtor padrão
    }
    
    // Método getter para obter o nome do diretor
    public String getDirector() {
        return director;
    }

    // Método setter para definir o nome do diretor
    public void setDirector(String director) {
        this.director = director;
    }
}
