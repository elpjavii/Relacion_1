package relacion_1;
import java.util.Scanner;

public class ej_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("longitud de cateto 1: ");
		float cat_1 = teclado.nextFloat();
		System.out.println("longitud de cateto 2: ");
		float cat_2 = teclado.nextFloat();
		
		
		double resu = Math.sqrt(Math.pow(cat_1, 2) + Math.pow(cat_2,2));
		
		System.out.printf("el resultado de la hipotenusa es %.2f",resu);
	}

}
