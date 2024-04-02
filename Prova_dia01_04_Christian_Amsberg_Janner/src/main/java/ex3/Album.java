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
//Utilizando herança da classe Product na classe Album
public class Album extends Product {

    //Abstração de atributo.
    private String artist;

    //Construtores sobrecarregados para herdar o construtor da classe mãe.
    public Album() {
        super();
    }

    public Album(String artist, String name, double price, Integer numberOfCopies) {
        super(name, price, numberOfCopies);
        this.artist = artist;
    }

    // Get e Set do atributo especifico da classe Album.
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}