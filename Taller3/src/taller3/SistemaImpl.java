package taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaImpl implements Sistema {
	
	private ArrayList<Proyecto> listaProyecto = new ArrayList<>();
	private ArrayList<Usuario> listaUsuario = new ArrayList<>();
	private ArrayList<Tarea> listaTarea = new ArrayList<>();
	
	private static SistemaImpl instancia;
	
	public static SistemaImpl getIsntancia() {
		if(instancia == null) { //singleteon 
			instancia = new SistemaImpl();
			
		}
		return instancia;
	}


	@Override
	public void mostrarListaProyectos() {
	
		for(Proyecto proyect : listaProyecto) {
			System.out.println("Id proyecto : "+proyect.getIdProyect());
			System.out.println("Nombre proyecto : "+proyect.getNombreProyect());
			System.out.println("Usuario responsable : "+proyect.getResponsableProyect());
			System.out.println();
		}
		
	}

	@Override
	public void filtrarTareasUsuario() {
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
	public void actualizarEstadoTarea() {
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
	public void aplicarVisitorTareas() {
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
	public void mostrarTodosProyectosTareas() {
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
	public void agregarEliminarProyectos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregaroEliminarTareaProyecto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asignarPrioridadesStrategy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarReporteProyecto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarUsuario(String usuario_ , String contraseña, String rol) {
		Usuario usuario = new  Usuario(usuario_, contraseña, rol);
		listaUsuario.add(usuario);
	}

	@Override
	public void agregarProyecto(String idProyect, String NombreProyect, String usuarioProyecto) {
		Proyecto proyecto = new Proyecto(idProyect, NombreProyect, usuarioProyecto);
		listaProyecto.add(proyecto);
		
		
		
	}

	@Override
	public void agregarTareas(String proyecto, String idTarea,String tipo, String descripcion, String estado, String responsable,
			String complejidad, String fecha) {
		Tarea tarea = new Tarea(proyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
		listaTarea.add(tarea);
		
		for(Proyecto proyect : listaProyecto) { // agrega tareas del proyecto en especifico 
			if(proyect.getIdProyect().equalsIgnoreCase(tarea.getidProyecto())) {
				proyect.agregarTareas(tarea);
				
			}
		}
	}
	
	
	

}
