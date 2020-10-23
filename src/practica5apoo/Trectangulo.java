//Eduardo Isaac Davila Bernal
//2193076785
//17-Octubre-2020
//Programacion Orientada a Objetos

package practica5apoo;

/**
 *
 * @author Newton
 */
public class Trectangulo extends Triangulo{
    public Trectangulo() {
        super();
    }
    
    @Override
    public double Obtener_Area() {
        int i,j;
        double[] aux = new double[3];		
   	double temporal, R=0;
	for(i=1;i<get_Lados();i++){
            aux[i-1]=ArrayPoints[i-1].distancia(ArrayPoints[i]);
	}
	aux[2]=ArrayPoints[i-1].distancia(ArrayPoints[0]);
	for (i = 0;i < 3; i++){
            for (j = 0; j < 2; j++){
		if (aux[j] < aux[j+1]){ // Ordena el array de mayor a menor, cambiar el "<" a ">" para ordenar de menor a mayor
                    temporal = aux[j]; 
                    aux[j] = aux[j+1]; 
                    aux[j+1] = temporal;
                }
            }
	}
        R=(aux[1]*aux[2])/2;
        return R;
    }
}
