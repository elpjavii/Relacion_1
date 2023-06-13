package relacion_1;
import java.util.Scanner;

public class ej_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.printf("buenos dias %s",
				nombre);
	}

}
