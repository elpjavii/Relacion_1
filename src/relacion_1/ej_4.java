package relacion_1;
import java.util.Scanner;

public class ej_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce los grados en centigrados: ");
		float grados = teclado.nextFloat();
		
		grados = 32 + ((9*grados)/5);
		
		System.out.println("los grados en fahrenheit son "+grados+"Fg");
	}

}
