//Eduardo Isaac Davila Bernal
//2193076785
//17-Octubre-2020
//Programacion Orientada a Objetos

package practica5apoo;

import practica5apoo.Punto;
import practica5apoo.Punto;
/**
 *
 * @author Newton
 */
public abstract class Figuras {
    Punto ArrayPoints[];
    private int lados;
    
    public Figuras(){
    }
    public Figuras(int lados, Punto ArrayPoints[]){
        this.lados=lados;
        this.ArrayPoints = ArrayPoints;
    }
    
    public void Cambiar_Datos(int lados, Punto ArrayPoints[]){
        this.lados = lados;
        this.ArrayPoints = ArrayPoints;
    }
    
    double get_Lados(){
        return lados;
    }
    
    public abstract double Obtener_Perimetro();
    
    public abstract double Obtener_Area();
}
