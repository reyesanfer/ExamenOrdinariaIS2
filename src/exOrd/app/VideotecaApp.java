package exOrd.app;


import exOrd.control.shuffleCommand;
import exOrd.control.selectCommand;
import exOrd.model.Film;
import exOrd.model.Videoteca;
import exOrd.view.VideotecaAppView;
import java.util.Scanner;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 10:36 GMT
 *
 */

public class VideotecaApp implements VideotecaAppView{

    private Videoteca videoteca;
    private selectCommand search;
    private shuffleCommand shuffle;
    
    public VideotecaApp() {
        videoteca = new Videoteca();
        fill(videoteca);
        search = new selectCommand(videoteca);
        shuffle = new shuffleCommand(videoteca);
    }

    public boolean hacer() {
        boolean flag = false;
        this.display();
        System.out.println("Si desea buscar alguna pelicula en concreto escriba 'search'\n"+"Si desea cambiar el orden de las peliculas mostradas escriba 'shuffle'");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("search")) {
            this.search();
            flag = true;
        }
        if (scanner.nextLine().equals("shuffle")) {
            this.shuffle();
            flag = true;
        }
        return flag;
    }
    
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            flag = new VideotecaApp().hacer();
        }
        System.exit(0);
    }

    @Override
    public void display() {
        System.out.println(videoteca.toString());
    }
    
    public void search() {
        search.execute();
    }
    
    public void shuffle() {
        shuffle.execute();
        this.display();
    }

    private void fill(Videoteca videoteca) {
        videoteca.addFilm(new Film("Caratula1","titulo1",2000,"Director1","actor1, acteiz1","genero1","Todos los publicos","1:20:30",1000,5));
        videoteca.addFilm(new Film("Caratula2","titulo2",2000,"Director2","actor2, acteiz2","genero2","Todos los publicos","1:20:30",100,10));
        videoteca.addFilm(new Film("Caratula3","titulo3",2000,"Director3","actor3, acteiz3","genero3","Todos los publicos","1:20:30",2000,20));
        videoteca.addFilm(new Film("Caratula4","titulo4",2000,"Director4","actor4, acteiz4","genero4","Todos los publicos","1:20:30",10,1));
        videoteca.addFilm(new Film("Caratula5","titulo5",2000,"Director5","actor5, acteiz5","genero5","Todos los publicos","1:20:30",200,6));
        videoteca.addFilm(new Film("Caratula6","titulo6",2000,"Director6","actor6, acteiz6","genero6","Todos los publicos","1:20:30",30,3));
        videoteca.addFilm(new Film("Caratula7","titulo7",2000,"Director7","actor7, acteiz7","genero7","Todos los publicos","1:20:30",500,16));
        videoteca.addFilm(new Film("Caratula8","titulo8",2000,"Director8","actor8, acteiz8","genero8","Todos los publicos","1:20:30",300,12));
        videoteca.addFilm(new Film("Caratula9","titulo9",2000,"Director9","actor9, acteiz9","genero9","Todos los publicos","1:20:30",15,1));
        videoteca.addFilm(new Film("Caratula10","titulo10",2000,"Director10","actor10, acteiz10","genero10","Todos los publicos","1:20:30",100000,100));
        videoteca.addFilm(new Film("Caratula11","titulo11",2000,"Director11","actor11, acteiz11","genero11","Todos los publicos","1:20:30",16000,65));
        videoteca.addFilm(new Film("Caratula12","titulo12",2000,"Director12","actor12, acteiz12","genero12","Todos los publicos","1:20:30",1050,35));
        videoteca.addFilm(new Film("Caratula13","titulo13",2000,"Director13","actor13, acteiz13","genero13","Todos los publicos","1:20:30",1000,50));
        videoteca.addFilm(new Film("Caratula14","titulo14",2000,"Director14","actor14, acteiz14","genero14","Todos los publicos","1:20:30",1017,32));
        videoteca.addFilm(new Film("Caratula15","titulo15",2000,"Director15","actor15, acteiz15","genero15","Todos los publicos","1:20:30",1250,84));
    }

    
}
