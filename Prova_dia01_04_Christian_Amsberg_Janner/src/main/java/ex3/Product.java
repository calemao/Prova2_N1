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
// Definição da classe Product
public class Product {
    
    // Atributos para representar os dados genéricos de um produto
    private String name;
    private Double price;
    private Integer numberOfCopies;

    // Construtor que inicializa os atributos com os valores fornecidos
    public Product(String name, double price, Integer numberOfCopies) {
        this.name = name;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    } 

    // Construtor padrão
    public Product() {
        // Não há código aqui, apenas o construtor padrão
    }
    
    // Getters e Setters para os atributos encapsulados
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    
    // Método para vender cópias do produto
    public void sellCopies(){
       this.numberOfCopies--;
    }
    
    // Método para encomendar cópias adicionais do produto
    public void orderCopies(int num){
       this.numberOfCopies += num;    
    }
}
