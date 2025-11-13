package taller3;

import java.util.Scanner;

public class App_main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String menuElegido = "";
		int OpcionElegid = 0;
		
		do {
			System.out.println("¿Usuario o administrador? (u / a / s para salir)");
			System.out.print("> ");
			menuElegido = scan.nextLine().toUpperCase();
			
			switch (menuElegido) { // Menus
			case "U":// menu usuario
				System.out.println("Menu usuario");
				break;

			case "A":// menu admin 
				System.out.println("Menu admin");
				break;
				
			}//fin switch
			
			
		} while (!menuElegido.equalsIgnoreCase("s"));
		System.out.println("Saliendo...");
		

	}

}
