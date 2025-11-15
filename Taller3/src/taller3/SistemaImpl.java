package taller3;

import java.util.ArrayList;

public class SistemaImpl implements Sistema {
	
	private ArrayList<Proyecto> listaProyecto = new ArrayList<>();
	private ArrayList<Usuario> listaUsuario = new ArrayList<>();
	private ArrayList<Tarea> listaTarea = new ArrayList<>();
	
	private static SistemaImpl instancia;
	
	public static SistemaImpl getIsntancia() {
		if(instancia == null) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarEstadoTarea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarVisitorTareas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarTodosProyectosTareas() {
		// TODO Auto-generated method stub
		
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
	public void agregarUsuario(String usuario, String contraseña, String rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarProyecto(String idProyect, String NombreProyect, String usuarioProyecto) {
		Proyecto proyecto = new Proyecto(idProyect, NombreProyect, usuarioProyecto);
		listaProyecto.add(proyecto);
		
		
	}

	@Override
	public void agregarTareas(Proyecto proyecto, String idTarea, String descripcion, String estado, String responsable,
			String complejidad, String fecha) {
		// TODO Auto-generated method stub
		
	}

}
