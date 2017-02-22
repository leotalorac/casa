package homes;
import ch.aplu.turtle.Turtle;
/**
 * Created by lotalorafox on 2/22/2017.
 */
public class Rectangulo {
    public Turtle tortuga;
    //dibuja un rectangulo recibe la pos x,y, el ancho y el largo
    public void square(double a, double b, int c, int d){
        tortuga.setX(a);
        tortuga.setY(b);
        for(int i=0 ;i<2;i++){
            tortuga.right(90);
            tortuga.fd(c);
            tortuga.right(90);
            tortuga.fd(d);
        }
    }
}
