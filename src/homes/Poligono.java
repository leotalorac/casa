package homes;
import ch.aplu.turtle.Turtle;
/**
 * Created by lotalorafox on 2/22/2017.
 */
public class Poligono {
    public Turtle tortuga;
    //dibuja un poligono, recibe pos x y y el largo
    public void polig(double a, double b,double c){
        tortuga.setX(a);
        tortuga.setY(b);
        //tortuga.right(90);
        for(int i =0;i<2;i++) {
            tortuga.fd(c);
            tortuga.right(30);
            tortuga.fd(c);
            tortuga.right(120);
            tortuga.fd(c);
            tortuga.right(30);
        }
        //tortuga.left(90);

    }
}
