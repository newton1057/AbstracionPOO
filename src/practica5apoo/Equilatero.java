//Eduardo Isaac Davila Bernal
//2193076785
//22-Octubre-2020
//Programacion Orientada a Objetos
package practica5apoo;

public class Equilatero extends Triangulo {
    public Equilatero() {
        super();
    }
    
    @Override
    public double Obtener_Area() {
        int i=0;
        double Base, Altura, menorY, R;
	Altura=ArrayPoints[i].y;
	menorY=ArrayPoints[i].y;
	for(i=0;i<get_Lados()-1;i++){
            if(ArrayPoints[i].y<ArrayPoints[i+1].y){
                Altura=ArrayPoints[i+1].y;
            }
	}
	for(i=0;i<get_Lados()-1;i++){
            if(ArrayPoints[i].y>ArrayPoints[i+1].y){
                menorY=ArrayPoints[i+1].y;
            }
	}
	Altura=Altura-menorY;
	Base = ArrayPoints[0].distancia(ArrayPoints[1]);
	R=(Base*Altura)/2;
        return R;
    }
}
