package relacion_1;
import java.util.Scanner;

public class ej_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el radio: ");
		float radio = teclado.nextFloat();
		
		double longi, area;
		
		longi =Math.round((2*Math.PI*radio)*100.0)/100.0;
		area = Math.round((Math.PI*Math.pow(radio, 2))*100.0)/100.0;
		
		System.out.println("la longitud es: "+longi+", el area es: "+area);
		
	}

}
