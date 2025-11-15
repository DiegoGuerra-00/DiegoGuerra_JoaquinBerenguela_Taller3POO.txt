package taller3;

public class Tarea {
	private Proyecto idProyecto;
	private String idTarea;
	private String descripcionTarea;
	private String estadoTarea;
	private String responsabelTarea;
	private String complejidad;
	private String fecha;
	
	public Tarea(Proyecto idProyecto, String idTarea, String descripcionTarea, String estadoTarea,
			String responsabelTarea, String complejidad, String fecha) {
		super();
		this.idProyecto = idProyecto;
		this.idTarea = idTarea;
		this.descripcionTarea = descripcionTarea;
		this.estadoTarea = estadoTarea;
		this.responsabelTarea = responsabelTarea;
		this.complejidad = complejidad;
		this.fecha = fecha;
	}

	public Proyecto getIdProyecto() {
		return idProyecto;
	}

	public String getIdTarea() {
		return idTarea;
	}

	public String getDescripcionTarea() {
		return descripcionTarea;
	}

	public String getEstadoTarea() {
		return estadoTarea;
	}

	public String getResponsabelTarea() {
		return responsabelTarea;
	}

	public String getComplejidad() {
		return complejidad;
	}

	public String getFecha() {
		return fecha;
	}
	
	

}
