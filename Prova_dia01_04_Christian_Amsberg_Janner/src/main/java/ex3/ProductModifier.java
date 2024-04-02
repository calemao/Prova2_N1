/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Alemãozinho Te Ama
 */
public class ProductModifier {
    // Método para definir o nome do produto
    public void setName(Product product, String name) {
        product.setName(name);
    }

    // Método para definir o artista do álbum
    public void setArtist(Album album, String artist) {
        album.setArtist(artist);
    }

    // Método para definir o diretor do filme
    public void setDirector(Movie movie, String director) {
        movie.setDirector(director);
    }

    // Método para definir o preço do produto
    public void setPrice(Product product, double price) {
        product.setPrice(price);
    }

    // Método para definir o número de cópias do produto
    public void setNumberOfCopies(Product product, int numberOfCopies) {
        product.setNumberOfCopies(numberOfCopies);
    }
}
