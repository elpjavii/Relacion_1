package relacion_1;
import java.util.Scanner;

public class ej_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("lado 1: ");
		float lado_1 = teclado.nextFloat();
		System.out.println("lado 2: ");
		float lado_2 = teclado.nextFloat();
		System.out.println("lado 3: ");
		float lado_3 = teclado.nextFloat();
		
		float s = (lado_1 + lado_2 + lado_3)/2;
		double area = Math.round((Math.sqrt((s *(s-lado_1) * (s-lado_2) * (s-lado_3))))*100)/100;
		
		System.out.println(area);

	}

}
