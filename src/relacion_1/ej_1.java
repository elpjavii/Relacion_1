package relacion_1;
import java.util.Scanner;

public class ej_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce numero 1");
		int nombre_1 = teclado.nextInt();
		System.out.println("introduce numero 2");
		int nombre_2 = teclado.nextInt();
		
		System.out.printf("este es el numero 1: %d y este el numero 2: %d",
				nombre_1, nombre_2);

	}

}
