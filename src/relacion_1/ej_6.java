package relacion_1;
import java.util.Scanner;

public class ej_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce kilometros hora: ");
		double kms = teclado.nextFloat();
		kms = Math.round(((kms*1000)/3600)*100.0)/100.0;
		System.out.println("los mtros por segundo son "+kms);
		
	}

}
