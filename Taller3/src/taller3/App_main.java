package taller3;

import java.util.Scanner;

public class App_main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String menuElegido = "";

		do {
			System.out.println("¿Usuario o administrador? (u / a / s para salir)");
			System.out.print("> ");
			menuElegido = scan.nextLine().toUpperCase();

			switch (menuElegido) { // Menus
			case "U":// menu usuario
				System.out.println("Menú Usuario");
				int OpcionElegid = 0;

				System.out.println("1. Ver proyectos disponibles" + "\n" + "2. Ver tareas asignadas" + "\n"
						+ "3. Actualizar estado de una tarea" + "\n" + "4. Aplicar Visitor sobre tareas" + "\n"
						+ "5. Salir");
				System.out.print("> ");
				OpcionElegid = Integer.valueOf(scan.nextLine());

				switch (OpcionElegid) { // incio opciones usuario
				case 1:

					break;

				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				}// fin switch opciones menu usuario

				break; // break menu usuario

			case "A":// menu admin
				System.out.println("Menú Admin");
				int OpcionElegid2 = 0;

				System.out.println("1. Ver lista completa de proyectos y tareas" + "\n" + "2. Agregar o eliminar un proyecto" + "\n"
						+ "3. Agregar o eliminar una tarea en un proyecto" + "\n" + "4. Asignar prioridades con Strategy" + "\n"
						+ "5. Generar reporte de proyectos"+"\n"+"6. Salir");
				System.out.print("> ");
				
				OpcionElegid2 = Integer.valueOf(scan.nextLine());
				
				switch (OpcionElegid2) {//inicio switch opciones admin 
				case 1:
					
					break;

				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;	
				}//fin switch opciones Admin 
				
				
				break; // break menu admin

			}// fin switch

		} while (!menuElegido.equalsIgnoreCase("s"));
		System.out.println("Saliendo...");

	}

}
