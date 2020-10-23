//Eduardo Isaac Davila Bernal
//2193076785
//17-Octubre-2020
//Programacion Orientada a Objetos

package practica5apoo;

/**
 *
 * @author Newton
 */
public class Punto {
    public int x,y;
    
    public Punto(){
        x=1;
        y=1;
    }
    
    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public void Colocar_Puntos(int x, int y){
        this.x=x;
        this.y=y;
    }

    double distancia(Punto ArrayPoint) {
        double aux=0;
        aux = Math.pow((x-ArrayPoint.x),2) + Math.pow((y-ArrayPoint.y),2);
        return (Math.sqrt(aux));
    }
}
