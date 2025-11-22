// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

public class Tarea implements Visitoraccept { // creacion de la clase Tarea
	private String idproyecto;
	private String idtarea;
	private String tipo;
	private String descripcionTarea;
	private String estadoTarea;
	private String responsabelTarea;
	private String complejidad;
	private String fecha;
	
	public Tarea(String idroyecto,String idtarea, String tipo, String descripcionTarea, String estadoTarea,
			String responsabelTarea, String complejidad, String fecha) {
		this.idproyecto = idroyecto;
		this.idtarea = idtarea;
		this.tipo = tipo;
		this.descripcionTarea = descripcionTarea;
		this.estadoTarea = estadoTarea;
		this.responsabelTarea = responsabelTarea;
		this.complejidad = complejidad;
		this.fecha = fecha;
	}
	public String getidProyecto() {
		return idproyecto;
	}

	public String getIdTarea() {
		return idtarea;
	}

	public String getTipoTarea() {
		return tipo;
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
	public void setProyecto(String proyecto) {
		this.idproyecto = proyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idproyecto = idProyecto;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDescripcionTarea(String descripcionTarea) {
		this.descripcionTarea = descripcionTarea;
	}
	public void setEstadoTarea(String estadoTarea) {
		this.estadoTarea = estadoTarea;
	}
	public void setResponsabelTarea(String responsabelTarea) {
		this.responsabelTarea = responsabelTarea;
	}
	public void setComplejidad(String complejidad) {
		this.complejidad = complejidad;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	

}


