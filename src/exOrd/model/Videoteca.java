
package exOrd.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 11:06 GMT
 *
 */

public class Videoteca {
    
    private List<Film> films;          //ord=0 (Por defecto) ordenacion por genero
    private List<Film> mostPlayed;     //ord=1 ordenacion de mas vistas
    private List<Film> mostValorated;  //ord=2 ordenacion de mas valoradas
    private List<Film> recentlyAdded; //ord=3 ordenacion de recientemente añadidas
    private int ord;

    public Videoteca() {
        ord = 0;
        this.films = new ArrayList<>();
        this.mostPlayed = new ArrayList<>();
        this.mostValorated = new ArrayList<>();
        this.recentlyAdded = new ArrayList<>();    
    }
    
    public boolean addFilm(Film film) {
        if (film != null && !films.contains(film)) {
            films.add(film);
            addValorated(film);
            addPlayed(film);
            addRecently(film);
            return true;
        }
        return false;
    }
    
    public Film selectFilm(String title){
        for (Film film : films) {
            if (film.getTitle().equals(title)) {
                System.out.println(film.toString());
                return film;
            }
        }
        return null;
    }
    
    public void setOrd(int ord) {
        this.ord = ord;
    }
    
    /**
     * 
     * @param film
     * Este metodo se encarga de que la lista de peliculas añadidas recientemente
     * nunca supere el maximo de 10 peliculas añadidas y la va actualizando eliminado
     * el elemento mas antiguo en caso de que sea necesario
     * 
     */
    public void addRecently(Film film) {
        if (recentlyAdded.size() >= 10) {
            recentlyAdded.remove(0);
            recentlyAdded.add(film);
        } else {
            recentlyAdded.add(film);
        }
    }
    
    @Override
    public String toString() {
        if (this.ord == 0) {
            return films.toString();
        }
        if (this.ord == 1) {
            return mostPlayed.toString();
        }
        if (this.ord == 2) {
            return mostValorated.toString();
        }
        if (this.ord == 3) {
            return recentlyAdded.toString();
        }
        return "Valor de orden no permitido";
    }

    
    /**
     * 
     * @param film 
     * Este metodo se encarga de comparar las valoraciones de la pelicula que se quiere añadir y las que ya 
     * se encuentran en la lista de las mas valoradas y en caso de que la pelicula que se quiera añadir tenga mayor
     * valoracioon que las ya almacenadas se actualiza la lista con un maximo de 10 peliculas
     * 
     */
    private void addValorated(Film film) {
        if (mostValorated.size() >= 10) {
            for (int i = 0; i < mostValorated.size(); i++) {
                if (mostValorated.get(i).getValoracion() < film.getValoracion()) {
                    mostValorated.remove(i);
                    mostValorated.add(film);
                }
            }
        } else {
            mostValorated.add(film);
        }
    }

    /**
     * 
     * @param film 
     * Este metodo se encarga de comparar las vistas de la pelicula que se quiere añadir y las que ya 
     * se encuentran en la lista de las mas vistas y en caso de que la pelicula que se quiera añadir tenga más vistas
     * que las ya almacenadas se actualiza la lista con un maximo de 10 peliculas
     * 
     */
    private void addPlayed(Film film) {
        if (mostPlayed.size() >= 10) {
            for (int i = 0; i < mostPlayed.size(); i++) {
                if (mostPlayed.get(i).getValoracion() < film.getValoracion()) {
                    mostPlayed.remove(i);
                    mostPlayed.add(film);
                }
            }
        } else {
            mostPlayed.add(film);
        }
    }
}
