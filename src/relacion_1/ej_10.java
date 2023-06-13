package relacion_1;
import java.util.Scanner;

public class ej_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("precio del producto: ");
		float precio = teclado.nextFloat();
		System.out.println("cantidad a pagar: ");
		float pagado = teclado.nextFloat();
		
		float vuelta = precio - pagado;
		
		int ipart = (int) vuelta;
		double fpart = vuelta - ipart;
		// esto para sacar los centimos a enteros y poder operar con ellos
		// int centimos = Math.round((fpart/100)*100);
		int centimos = (int) (fpart*100);

		
		int mon_2= ipart/2, mon_1 = ipart%2;
		
		int mon_50 = centimos/50, rest_50 = centimos%50;
		
		int mon_20 = rest_50/20, rest_20 = rest_50%20;
		
		int mon_10 = rest_20/10, rest_10 = rest_20%10;
		
		int mon_5 = rest_10/5, rest_5 = rest_10%5;
		
		int cent_2 = rest_5/2, cent_1 = rest_5%2;
		
		
		System.out.println("monedas de 2, 1, 0,50, 0,20, 0,10, 0,05, 0,02, 0,01 euros: "+mon_2+" "
							+mon_1+" "+mon_50+" "+mon_20+" "+mon_10+" "+mon_5+" "+cent_2+" "+cent_1+" ");
		}

}
