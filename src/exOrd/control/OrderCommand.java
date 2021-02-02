
package exOrd.control;

import exOrd.model.Videoteca;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/02/02 11:03 GMT
 *
 */

public class OrderCommand implements Command{
    
    private final Videoteca videoteca;

    public OrderCommand(Videoteca videoteca) {
        this.videoteca = videoteca;
    }

    @Override
    public void execute(int ord) {
        videoteca.setOrd(ord);
    }

    
}
