package homes;
import ch.aplu.turtle.Turtle;
/**
 * Created by lotalorafox on 2/22/2017.
 */
public class Triangulo {
    public Turtle tortuga;
    //dibuja un triangulo equilatero, recibe un pos x,y, y el largo de los catetos
    public void triangle( double a, double b,int c){
        tortuga.setX(a);
        tortuga.setY(b);
        //triangle
        tortuga.right(30);
        tortuga.fd(c);
        tortuga.right(120);
        tortuga.fd(c);
        tortuga.right(120);
        tortuga.fd(c);
    }
}
