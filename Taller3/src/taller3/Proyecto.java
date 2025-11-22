// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  


package taller3;

import java.util.ArrayList;

public class Proyecto {
	private String idProyect;
	private String nombreProyect;
	private String responsableProyect;
	
	private ArrayList<Tarea> listaTareas;
	
	public Proyecto(String idProyect, String nombreProyect, String responsableProyect) {
		super();
		this.idProyect = idProyect;
		this.nombreProyect = nombreProyect;
		this.responsableProyect = responsableProyect;
		this.listaTareas = new ArrayList<>();
	}

	public String getIdProyect() {
		return idProyect;
	}

	public String getNombreProyect() {
		return nombreProyect;
	}

	public String getResponsableProyect() {
		return responsableProyect;
	}

	public ArrayList<Tarea> getListaTareas() {
		return listaTareas;
	}
	
	public void agregarTareas(Tarea t) {
		listaTareas.add(t);
	}
	
	
	
	

}

