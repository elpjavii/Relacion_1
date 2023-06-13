package relacion_1;
import java.util.Scanner;
import java.util.Scanner;

public class ej_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("radio de la esfera: ");
		float radio = teclado.nextFloat();
		
		double resu = Math.round(((3/4.0*Math.PI*Math.pow(radio,3))*100)/100);
		
		System.out.println(resu);
	}

}
