package relacion_1;
import java.util.Scanner;

public class ej_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero: ");
		int num = teclado.nextInt();
		
		String  digitos = String.valueOf(num);
		
		char[] nums1 = digitos.toCharArray();
		
		int cont_1 = 0;
		int cont_2;
		
		while (cont_1 < digitos.length()) {
			cont_2 = 0;
			int a_suma = Character.getNumericValue(nums1[cont_1]);
			while(cont_2 <= cont_1) {
				a_suma = a_suma + 1;
				System.out.print(a_suma);
				// System.out.print(nums1[cont_1]);
				cont_2++;
			}
			System.out.println();
			cont_1++;
		}
	}

}
