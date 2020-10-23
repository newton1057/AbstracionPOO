//Eduardo Isaac Davila Bernal
//2193076785
//22-Octubre-2020
//Programacion Orientada a Objetos
package practica5apoo;
import java.util.Scanner;

public class Cuadrilatero extends Figuras{
    private int lados;
    Scanner Leer = new Scanner (System.in);
    public Cuadrilatero() {
        super();
        int x,y,i;
        Punto[] P  = new Punto[4];
        for(i=0;i<4;i++){
            System.out.print("Ubicacion del punto "+i+" X: ");
            x=Leer.nextInt();
            System.out.print("Ubicacion del punto "+i+" Y: ");
            y=Leer.nextInt();
            P[i] = new Punto(x, y);                                    
        }
        Cambiar_Datos(4,P);
    }

    @Override
    public double Obtener_Perimetro() {
        int i;
        double R = 0;
        for(i=1;i<lados;i++){
            R=R+ArrayPoints[i-1].distancia(ArrayPoints[i]);
        }
        R=R+ArrayPoints[i-1].distancia(ArrayPoints[0]);
        return R;
    }

    @Override
    public double Obtener_Area() {
        int i;
        double R = 0;
        double[] aux = new double[2];
	for(i=1;i<lados-1;i++){
            aux[i-1]= ArrayPoints[i-1].distancia(ArrayPoints[i]);
	}
	R=aux[0]*aux[1];
        return R;
    }
}
