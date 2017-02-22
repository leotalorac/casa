package homes;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author @lotalorafox
 */
//MAIN

public class Home {

    public static void main(String[] args) {
        // defino los objetos de las calses necesarias
        Poligono p = new Poligono();
        Rectangulo c = new Rectangulo();
        Triangulo t = new Triangulo();
        Turtle e = new Turtle();
        //creo el objeto en la clse principal que realiza las asociaciones
        Tortuguita luis = new Tortuguita(e,p,c,t);
        //dibuja la casa con el objeto de la lcase principal
        luis.techo();
        luis.estructura();
        luis.ventana();
        luis.puerta();






    }



}
