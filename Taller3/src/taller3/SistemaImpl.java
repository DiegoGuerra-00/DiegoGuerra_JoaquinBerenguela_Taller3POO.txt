
// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  


package taller3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaImpl implements Sistema { //implementa la interfaz del Sistema
	 
	private ArrayList<Proyecto> listaProyecto = new ArrayList<>(); // creacion de listas de diferentes tipos, todo para ser usadas en los metodos 
	private ArrayList<Usuario> listaUsuario = new ArrayList<>();
	private ArrayList<Tarea> listaTarea = new ArrayList<>();
	
	private static SistemaImpl instancia; // se privatiza para la creacion del Singleteon

	private PrioridadStrategy strategy; // se privatiza para hacer el Strategy

	private Factory factory; // se privatiza para hacer el Factory
	
	private SistemaImpl(Factory factory) {
		this.factory = factory;  // implementacion del factory
	}	
	private SistemaImpl() {}  // creacion de un constructor privado 
	
	public static SistemaImpl getIsntancia() { // se aplica el singleteon 
		if(instancia == null) { //singleteon 
			instancia = new SistemaImpl(new FactoryIMPL());
			
		}
		return instancia;
	}


	@Override
	public void mostrarListaProyectos() { // se muestra la lista de todos los proyectos
	
		for(Proyecto proyect : listaProyecto) {
			System.out.println("Id proyecto : "+proyect.getIdProyect());
			System.out.println("Nombre proyecto : "+proyect.getNombreProyect());
			System.out.println("Usuario responsable : "+proyect.getResponsableProyect());
			System.out.println();
		}
		
	}

	@Override
	public void filtrarTareasUsuario() { // se filtra las tareas del usuario, se debera indicar que usuario se quiere filtrar
		// colab1 , colab2
		Scanner s = new Scanner(System.in);
		System.out.print("Indique usuario (colab1 / colab2): ");
		String usuario = s.nextLine().toLowerCase();
		while(!usuario.equalsIgnoreCase("colab1") && !usuario.equalsIgnoreCase("colab2")) {
			System.out.println("El usuario "+ usuario+" no existe, reintente : ");
			usuario = s.nextLine().toLowerCase();

		}
		System.out.println();
		System.out.println("Tareas de usuario "+usuario);
		System.out.println();
		for(Tarea t : listaTarea) {
			if(t.getResponsabelTarea().equalsIgnoreCase(usuario)) {
				System.out.println(t.getDescripcionTarea());
			}
		}
	
		System.out.println();
		//s.close();
		// no se cierra el scanner "s" ( s.close(); )  ya que al cerrarlo todo el progama da error
		
		
		
		
	}

	@Override
	public void actualizarEstadoTarea() { // se actualiza el estado de una tarea, el usuario ingresa que tarea quiere actualizar 
		Scanner scan = new Scanner(System.in);
		String idElegido;
		System.out.println("Listado de tareas ");
		System.out.println();
		System.out.println("ID");
		for(Tarea tareas : listaTarea) {
			System.out.println(tareas.getidProyecto() +"|"+tareas.getDescripcionTarea()+" (Estado : "+tareas.getEstadoTarea()+")");	
		}
		System.out.println();
		System.out.print("Eliga la id del proyecto: ");
		idElegido = scan.nextLine();
		
		for(Tarea tarea : listaTarea) {
			if(tarea.getidProyecto().equalsIgnoreCase(idElegido)) {
				System.out.println("Estado actual de la tarea: "+tarea.getEstadoTarea());
				String estadoTarea;
				System.out.print("Ingrese el nuevo estado de la tarea (Pendiente / En progreso / Completada): ");
				estadoTarea = scan.nextLine();
				tarea.setEstadoTarea(estadoTarea);
				System.out.println("El estado de la tarea "+" '"+tarea.getDescripcionTarea()+"' "+ "ha sido actualizado!");
				System.out.println("Estado : "+tarea.getEstadoTarea());
				
			}
		}
	}

	@Override
	public void aplicarVisitorTareas() { // se aplica el visitor y se printea por pantalla
		Visitor bugVisitor =  new AccionBug();
		Visitor featureVisitor =  new AccionFeature();
		Visitor accionDocumentacion =  new AccionDocumentacion();
		
		
		for(Tarea tarea : listaTarea) {
			String tipoTarea = tarea.getTipoTarea().toLowerCase();
			
			switch (tipoTarea) {//inicio switch
			case "bug":
				tarea.accept(bugVisitor);
				break;
			case "feature":
				tarea.accept(featureVisitor);
				break;
			case "documentacion":
				tarea.accept(accionDocumentacion);
				break;
			}//fin switch
		}
		
		
	}

	@Override
	public void mostrarTodosProyectosTareas() { // se muestran todos los proyectos junto a sus tareas
		System.out.println("Lista completa de proyectos y sus tareas");
		System.out.println();
		
		for(Proyecto proyecto : listaProyecto) {
			System.out.println("El proyecto '"+proyecto.getNombreProyect()+"' tiene las siguientes tareas: ");
			ArrayList<Tarea> tareas = proyecto.getListaTareas();
			for(Tarea tarea : tareas) {
				System.out.println("--> "+tarea.getDescripcionTarea()+" ("+tarea.getEstadoTarea()+")");
			}
			System.out.println();
//			for(int i= 0; i<tareas.size(); i++) {
//				System.out.println("--> "+tareas.get(2));
//			}
//			System.out.println();
//			
			
			
		}
		
	}

	@Override  
	public void agregarOEliminarProyectosYTareasAsociadas() { // se eliminan proyectos y las tareas asociadas a este , se pide informacion para que el usuario ingrese
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Agregar o eliminar proyecto (a/e):");
		String decision = s.nextLine();
		if(decision.equalsIgnoreCase("A")) {
			
			System.out.println("Ingrese su nombre:");
			String nombre = s.nextLine();
			System.out.println("Ingrese responsable");
			String responsable = s.nextLine();
			
			String idNuevo = "PR" + "0" + "0" + (listaProyecto.size() + 1);
			
			Proyecto nuevoProyecto = new Proyecto(idNuevo, nombre, responsable);
			listaProyecto.add(nuevoProyecto);
			System.out.println("Proyecto creado y agregado con éxito");
			
		}else if(decision.equalsIgnoreCase("E")) {
			
			System.out.println("Elija el proyecto a eliminar por su ID");
			
			mostrarListaProyectos();
			
			String proyectoAEliminar = s.nextLine();
			
			for (Proyecto proyecto : listaProyecto) {
				
				if(proyecto.getIdProyect().equalsIgnoreCase(proyectoAEliminar)) {
					for (Tarea tarea : listaTarea) {
						if(tarea.getIdTarea().equalsIgnoreCase(proyectoAEliminar)) {
							listaTarea.remove(tarea);
						}
					}
					listaProyecto.remove(proyecto);
					break;
				}
				
			}
			System.out.println("El proyecto seleccionado ha sido \n eliminado junto con sus tareas con éxito");
		}
	}

	@Override
	public void agregarOEliminarTareaProyecto() { // se agregan y/o eliminan tareas de un proyecto en especifico
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Agregar o eliminar una tarea de un proyecto (a/e):");
		String decision = s.nextLine();
		
		if(decision.equalsIgnoreCase("A")) {
			
			mostrarListaProyectos();			
			System.out.println("Elija el proyecto por su ID (PRnnn)");
			String proyectoSeleccionado = s.nextLine();
			
			System.out.println("Ingrese tipo de tarea:");
			System.out.println("Estos pueden ser: 'Bug', 'Feature', 'Documentacion' ");
			String tipoTareaNueva = s.nextLine();
			
			System.out.println("Añada una descripción:");
			String nuevaDescripcion = s.nextLine();
			
			System.out.println("Estado inicial (Pendiente / En progreso / Completada)");
			String nuevoEstadoInicial = s.nextLine();
			
			System.out.println("Responsable:");
			String nuevoResponsable = s.nextLine();
			
			System.out.println("Complejidad (Baja / Media / Alta):");
			String complejidadNueva = s.nextLine();
			
			System.out.println("Ingrese fecha de creación (aaaa-mm-dd)");
			String fechaNueva = s.nextLine();

			String nuevoIDParaTarea = "PR" + "0" + "0" + (listaTarea.size() + 1);

//			FALTA COMPLEJIDAD
			Tarea nuevaTarea = new Tarea(proyectoSeleccionado, nuevoIDParaTarea, tipoTareaNueva,
										nuevaDescripcion, nuevoEstadoInicial, nuevoResponsable,
										complejidadNueva, fechaNueva);

			for (Proyecto proyecto : listaProyecto) {

				if (proyecto.getIdProyect().equalsIgnoreCase(proyectoSeleccionado)) {

					proyecto.getListaTareas().add(nuevaTarea);
					break;
				}
				
			}
			System.out.println("Tarea agregada con éxito");

		} else if (decision.equalsIgnoreCase("E")) {

			mostrarListaProyectos();
			System.out.println("Elija el proyecto por su ID (PRnnn)");
			String proyectoSeleccionado = s.nextLine();
			
			//FALTA IMPRIMIR LAS TAREAS CON LOS PROYECTOS
			System.out.println();
			for (Proyecto proyecto : listaProyecto) {
				for (Tarea tarea : proyecto.getListaTareas()) {
					if(tarea.getidProyecto().equalsIgnoreCase(proyectoSeleccionado))
					System.out.println(tarea.getIdTarea() + tarea.getDescripcionTarea());
				}
			}
		System.out.println();
			
			System.out.println("Elija la tarea a eliminar según el ID:");
			String idTarea = s.nextLine();
			
			for (Proyecto proyecto : listaProyecto) {
				if(proyecto.getIdProyect().equalsIgnoreCase(proyectoSeleccionado)) {
					for (Tarea tarea: listaTarea) {
						if(proyecto.getIdProyect().equalsIgnoreCase(tarea.getidProyecto()) && 
							tarea.getIdTarea().equalsIgnoreCase(idTarea)) {
							proyecto.getListaTareas().remove(tarea);
							break;
						}
					}
					System.out.println("Tarea eliminada con éxito");
					break;
				}
			}
		}
	}

	@Override
	public void asignarPrioridadesStrategy() { // se aplica el strategy por las prioridades
		
		if (strategy == null) {
			System.out.println("No hay estrategia seleccionada.");
			return;
		}

		System.out.println("Aplicando Strategy de prioridad \n");
		strategy.asignarPrioridad(listaTarea);
		
	}
	
	@Override
	public void setPrioridadStrategy(PrioridadStrategy strategy) { // se aplica el strategy 
		this.strategy = strategy;
	}
	

	@Override
	public void generarReporteProyecto() { // se crea un archivo con toda la info de los proyectos 
		
		try {
			FileWriter fw = new FileWriter("reporte.txt");
			fw.write("--- REPORTE DE PROYECTOS ---\n");
			
			for (Proyecto proyecto : listaProyecto) {
				fw.write("\nProyecto: " + proyecto.getIdProyect() +
	                     " | " + proyecto.getNombreProyect() + " " + 
	                     "Responsable: " + proyecto.getResponsableProyect() + "\n");
	            fw.write("--------------TAREAS---------------\n");
	            
	            for (Tarea tarea : proyecto.getListaTareas()) {
	            	fw.write(
	                        "  - [" + tarea.getTipoTarea() + "] "
	                        + tarea.getDescripcionTarea()
	                        + " | Estado: " + tarea.getEstadoTarea()
	                        + " | Responsable: " + tarea.getResponsabelTarea()
	                        + " | Fecha: " + tarea.getFecha()
	                        + "\n");
				} 
			}
			fw.close();
			System.out.println("Reporte generado correctamente en reporte.txt");
			
		}catch(Exception e) {
			System.out.println("Error generando reporte" + e.getMessage());
		}
		
		
		
		
		
	}

	@Override
	public void agregarUsuario(String usuario_ , String contraseña, String rol) { // se usa para la implementacion del factory, crea objetos tipo usuario 
		Usuario usuario = factory.crearUsuario(usuario_, contraseña, rol);
		listaUsuario.add(usuario);
	}

	@Override
	public void agregarProyecto(String idProyect, String NombreProyect, String usuarioProyecto) {// se usa para la implementacion del factory, crea objetos tipo Proyecto
		Proyecto proyecto = factory.crearProyecto(idProyect, NombreProyect, usuarioProyecto);
		listaProyecto.add(proyecto);
		
		
		
	}

	@Override
	public void agregarTareas(String proyecto, String idTarea,String tipo, String descripcion, String estado, String responsable,
			String complejidad, String fecha) {// se usa para la implementacion del factory, crea objetos tipo Tarea
		Tarea tarea = factory.crearTareas(proyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
		listaTarea.add(tarea);
		
		for(Proyecto proyect : listaProyecto) { // agrega tareas del proyecto en especifico 
			if(proyect.getIdProyect().equalsIgnoreCase(tarea.getidProyecto())) {
				proyect.agregarTareas(tarea);
				
			}
		}
	}
	
	
	

}


