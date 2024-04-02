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

import java.util.ArrayList;
import java.util.List;

/**
 *@author1 Christian Amsberg Janner <janner.chris15@outlook.com>
 *@author2 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 */
// Definição da classe StockKeeper
public class StockKeeper {
    
    // Atributos para armazenar o nome do responsável e as listas de filmes e álbuns
    private String name;
    private final List<Movie> movieList;
    private final List<Album> albumList;

    // Método getter para obter o nome do responsável
    public String getName() {
        return name;
    }

    // Método setter para definir o nome do responsável
    public void setName(String name) {
        this.name = name;
    }

    // Construtor que inicializa o nome do responsável e as listas de filmes e álbuns
    public StockKeeper(String name) {
        this.name = name;
        this.albumList = new ArrayList<>(); // Inicializa a lista de álbuns
        this.movieList = new ArrayList<>(); // Inicializa a lista de filmes
    }
    
    // Método para gerenciar um filme, adicionando-o à lista de filmes
    public void manageMovie(Movie movie, String name, String director, Double price, Integer numberOfCopies){
         // Define os atributos do filme com os valores fornecidos
         movie.setName(name);
         movie.setDirector(director);
         movie.setPrice(price);
         movie.setNumberOfCopies(numberOfCopies);
         // Adiciona o filme à lista de filmes
         this.movieList.add(movie);
    }
    
    // Método para gerenciar um álbum, adicionando-o à lista de álbuns
    public void manageAlbum(Album album, String name, String artist, Double price, Integer numberOfCopies){
         // Define os atributos do álbum com os valores fornecidos
         album.setName(name);
         album.setArtist(artist);
         album.setPrice(price);
         album.setNumberOfCopies(numberOfCopies);
         // Adiciona o álbum à lista de álbuns
         this.albumList.add(album);
    }
}
