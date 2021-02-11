
package exOrd.control;

import exOrd.model.Videoteca;
import java.util.Scanner;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 12:37 GMT
 *
 */

public class SelectCommand implements Command {
    
    private final Videoteca videoteca;

    public SelectCommand(Videoteca videoteca) {
        this.videoteca = videoteca;
    }
    
    @Override
    public void execute() {
        System.out.print("Introduzca el titulo de la pelicula que desea buscar: ");
        Scanner scanner = new Scanner(System.in);
        videoteca.selectFilm(scanner.nextLine());
    }

}
