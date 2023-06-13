package relacion_1;
import java.util.Scanner;

public class ej_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero: ");
		int num = teclado.nextInt();
		
		String  digitos = String.valueOf(num);
		
		char[] nums1 = digitos.toCharArray();
		
		for(int i = 0; i < digitos.length(); i++) {
			System.out.println(nums1[i]);
		}
		
		
	}
	
}
