
package exOrd.control;

import exOrd.model.Videoteca;
import java.util.Scanner;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 11:03 GMT
 *
 */

public class orderCommand implements Command{
    
    private final Videoteca videoteca;

    public orderCommand(Videoteca videoteca) {
        this.videoteca = videoteca;
    }

    @Override
    public void execute() {
        System.out.print("Introduzca la ordenacion que quiere dar a las peliculas siendo: \n"+"0: ordenacion por genero\n"+"1: Lista de mas vistas\n"+"2: lista de más valoradas\n"
                +"3: lista de añadidas recientemente\n");
        Scanner scanner = new Scanner(System.in);
        videoteca.setOrd(scanner.nextInt());
    }

    
}
