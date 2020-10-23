//Eduardo Isaac Davila Bernal
//2193076785
//22-Octubre-2020
//Programacion Orientada a Objetos
package practica5apoo;
import java.util.Scanner;
public class Practica5POO {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion,subopcion,i;	
        Scanner Leer = new Scanner (System.in);
	System.out.println("Menu: ");
        System.out.println("1.-Triangulo ");
	System.out.println("2.-Cuadrilatero ");
	System.out.println("3.-Circulo ");
	System.out.print("Selecciona la opcion: ");
	opcion=Leer.nextInt();
	switch(opcion){
            case 1:{
                System.out.println("1.-Isosceles ");
		System.out.println("2.-Trectangulo");
                System.out.println("3.-Equilatero");
                System.out.print("Selecciona la opcion: ");
                subopcion=Leer.nextInt();
                    switch(subopcion){
                        case 1:{
                            Isosceles Obj = new Isosceles();
                            System.out.println("Perimetro de Triangulo Isosceles: "+ Obj.Obtener_Perimetro() );
                            System.out.println("Area de Triangulo Isosceles: "+ Obj.Obtener_Area());	
                            break;
                            }
			case 2:{          
                            Trectangulo Obj = new Trectangulo();
                            System.out.println("Perimetro de Triangulo Trectangulo: "+ Obj.Obtener_Perimetro() );
                            System.out.println("Area de Triangulo Trectangulo: "+ Obj.Obtener_Area());		
                            break;        
                            }	
			case 3:{                   
                            Equilatero Obj = new Equilatero();
                            System.out.println("Perimetro de Triangulo Equilatero: "+ Obj.Obtener_Perimetro() );
                            System.out.println("Area de Triangulo Equilatero: "+ Obj.Obtener_Area());
                            break;
                            }
			}
			break;	
		} 
		
		case 2: {
                    System.out.println("1.-Cuadrado");
                    System.out.println("2.-Rectangulo");
                    System.out.print("Selecciona la opcion: ");
		
                    subopcion=Leer.nextInt();
                    switch(subopcion){
			case 1:{
                            Cuadrado Obj = new Cuadrado();
                            System.out.println("Perimetro Cuadrado: "+Obj.Obtener_Perimetro());
                            System.out.println("Area Cuadrado: "+Obj.Obtener_Area());
                            break;
			}
			case 2:{
                            Rectangulo Obj = new Rectangulo();
                            System.out.println("Perimetro Rectangulo: "+Obj.Obtener_Perimetro());
                            System.out.println("Area Rectangulo: "+Obj.Obtener_Area());		
                            break;
                        }
                    }
                    break;	
		}
		case 3: {
                    Circulo Obj = new Circulo();
                    System.out.println("Perimetro Circulo: "+Obj.Obtener_Perimetro());
                    System.out.println("Area Circulo: "+Obj.Obtener_Area());	
                    break;
		}
	}
    }
}