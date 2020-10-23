//Eduardo Isaac Davila Bernal
//2193076785
//17-Octubre-2020
//Programacion Orientada a Objetos

package practica5apoo;

import java.util.Scanner;


import practica5apoo.Punto;
import practica5apoo.Punto;

/**
 * @author Newton
 */

public class Triangulo extends Figuras{ 
    Scanner Leer = new Scanner (System.in);
    
    public Triangulo() {
        super();
        int x,y,i;
  
        Punto[] P  = new Punto[3];
            for(i=0;i<3;i++){
                System.out.print("Ubicacion del punto "+i+" X: ");
                x=Leer.nextInt();
                System.out.print("Ubicacion del punto "+i+" Y: ");
                y=Leer.nextInt();
                P[i] = new Punto(x, y);                             
            }
            Cambiar_Datos(3,P);
    }

    @Override
    public double Obtener_Perimetro() {
        int i;
        double R = 0;
        for(i=1;i<get_Lados();i++){
		R=R+ArrayPoints[i-1].distancia(ArrayPoints[i]);
            }
            R=R+ArrayPoints[i-1].distancia(ArrayPoints[0]);
            return R;
    }   

    @Override
    public double Obtener_Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

