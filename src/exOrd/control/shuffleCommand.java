
package exOrd.control;

import exOrd.model.Videoteca;
import java.util.Scanner;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 01:26 GMT
 *
 */

public class shuffleCommand implements Command{
    
    private final Videoteca videoteca;

    public shuffleCommand(Videoteca videoteca) {
        this.videoteca = videoteca;
    }

    @Override
    public void execute() {
        System.out.print("Introduzca el orden que quiere dar a las peliculas siendo: \n0: orden por genero\n1: lista de mas vistas\n2: lista de mas valoradas\n3: lista de recientes\n");
        Scanner scanner = new Scanner(System.in);
        videoteca.setOrd(scanner.nextInt()); 
    }

}
