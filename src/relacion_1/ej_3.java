package relacion_1;
import java.util.Scanner;

public class ej_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero: ");
		int num = teclado.nextInt();
		
		System.out.println("el doble es "+num*2+" el triple es "+num*3);
	}

}
