package homes;
import ch.aplu.turtle.Turtle;
/**
 * Created by lotalorafox on 2/22/2017.
 */
//Clase Principal!!!!
public class Tortuguita {
    public Turtle Tortu;
    public Poligono poli;
    public Rectangulo rec;
    public Triangulo tri;

    //armador de la clase principal
    public Tortuguita(Turtle l, Poligono p, Rectangulo r, Triangulo t){
        Tortu =l;
        poli = p;
        rec = r;
        tri = t;
    }
    //metodo para el techo
    public void techo(){
        //asigna el "dibujante"
        this.tri.tortuga = Tortu;
        //utiliza el metodo de la clase asociada
        this.tri.triangle(-150,30,200);
    }
    public void estructura(){
        //asigna el "dibujante"
        this.rec.tortuga = Tortu;
        //utiliza el metodo de la clase asociada
        this.rec.square(-150,-170,200,200);
    }
    public void puerta(){
        //asigna el "dibujante"
        this.rec.tortuga = Tortu;
        //utiliza el metodo de la clase asociada
        this.rec.square(-120,-170,100,70);
    }
    public void ventana(){
        //asigna el "dibujante"
        this.poli.tortuga = Tortu;
        //utiliza el metodo de la clase asociada
        this.poli.polig(0,-50,30);
    }


}
