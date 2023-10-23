package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Apartamento;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int i;
		
		Apartamento[] vect = new Apartamento[10];
		
		for(i = 1 ; i <= n ; i++) {
			System.out.println(" RENT # "  + i + ":" );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Apartamento(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		
		
		for( i = 0 ; i < 10 ; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
			
		}
		
		
			
		sc.close();
	}
}
