
package exOrd.model;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 11:06 GMT
 *
 */

public class Film implements Comparable<Film>{
    
    private final String caratula;
    private final String title;
    private final int year;
    private final String director;
    private final String actores;
    private final String genero;
    private final String calificacion;
    private final String duracion;
    private int vistas;
    private int valoracion;

    public Film(String caratula, String title, int year, String director, String actores, String genero, String calificacion, String duracion) {
        this.caratula = caratula;
        this.title = title;
        this.year = year;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
        this.calificacion = calificacion;
        this.duracion = duracion;
        vistas = 0;
        valoracion = 0;
    }
    
    public void incrementVistas() {
        vistas++;
    }
    
    public void incrementValoracion(int valor) {
        valoracion += valor;
    }

    public int getVistas() {
        return vistas;
    }

    public int getValoracion() {
        return valoracion;
    }
    
    public String getCaratula() {
        return caratula;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getActores() {
        return actores;
    }

    public String getGenero() {
        return genero;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    @Override
    public int compareTo(Film film) {
        if (genero.equals(film.getGenero())) {
            return title.compareTo(film.getTitle());
        } else {
            return genero.compareTo(film.getGenero());
        }
    }
    
    @Override
    public boolean equals(Object film) {
        if (this == film) {
            return true;
        }
        if (this == null || film == null) {
            return false;
        }
        if (film instanceof Film) {
            Film f = (Film) film;
            if (caratula.equals(f.getCaratula()) && title.equals(f.getTitle()) && year == f.getYear() && director.equals(f.getDirector()) && actores.equals(f.getActores()) && genero.equals(f.getGenero()) && calificacion.equals(f.getCalificacion()) && duracion.equals(f.getDuracion())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getCaratula()+" || "+getTitle()+" || "+getYear()+" || "+getDirector()+" || "+getActores()+" || "+getGenero()+" || "+getCalificacion()+" || "+getDuracion();
    }
    
}
