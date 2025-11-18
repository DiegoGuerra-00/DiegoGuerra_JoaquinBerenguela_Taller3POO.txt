package taller3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App_main {

	public static void main(String[] args) throws FileNotFoundException {
		Sistema sistema =  SistemaImpl.getIsntancia();
		abrirProyecto(sistema);
		abrirTarea(sistema);
		arbrirUsuario(sistema);
		despeglarMenu(sistema);
		
		String matias = "MATIAS:v";

	}
	
	public static void despeglarMenu(Sistema sistema) {
		
		
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
					
					sistema.mostrarListaProyectos();
					break;

				case 2:
					sistema.filtrarTareasUsuario();
					break;
				case 3:
					sistema.actualizarEstadoTarea();
					break;
				case 4:
					sistema.aplicarVisitorTareas();

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
		scan.close();
		
	}
	public static void abrirProyecto(Sistema sistema) throws FileNotFoundException {
		Scanner s = new Scanner(new File("proyectos.txt"));
		while(s.hasNextLine()) { //se accede a la arch "proyectos" y se rellena la listaProyectos del Sistema
			String linea = s.nextLine();
			String[] partes = linea.split("\\|");
			
			String idproyecto = partes[0];
			String nombreProyecto = partes[1];
			String responsableProyecto = partes[2];
			
			sistema.agregarProyecto(idproyecto, nombreProyecto, responsableProyecto);
			
		}
		s.close();
		
		
		
	}
	public static void abrirTarea(Sistema sistema) throws FileNotFoundException {
		Scanner s = new Scanner(new File("tareas.txt"));
		while(s.hasNextLine()) { // metodo para acceder al arch "tareas" y guardar los datos
			String linea = s.nextLine();
			String[] partes = linea.split("\\|");
			
			String proyecto = partes[0];
			String idProyecto = partes[1];
			String tipoProyecto = partes[2];
			String descProyecto = partes[3];
			String estadoProyecto = partes[4];
			String responsable = partes[5];
			String complejidadProyecto = partes[6];
			String fechaProyecto = partes[7];
			sistema.agregarTareas(proyecto, idProyecto, tipoProyecto, descProyecto, estadoProyecto, responsable, complejidadProyecto, fechaProyecto);
		
	   }s.close();
	}
	public static void arbrirUsuario(Sistema sistema ) throws FileNotFoundException {
		Scanner s = new Scanner(new File("usuarios_.txt"));
		while(s.hasNextLine()) { // metodo para acceder al arch "usuarios" y guardar los datos
			String linea = s.nextLine();
			String[] partes = linea.split("\\|");
			
			String usuario = partes[0];
			String contraseña = partes[1];
			String rol = partes[2];
			
			sistema.agregarUsuario(usuario, contraseña, rol);
			
		}s.close();
		
		
	}
}
