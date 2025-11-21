package taller3;

import java.util.ArrayList;

public class PrioridadTipoStrategy implements PrioridadStrategy{

	@Override
	public void asignarPrioridad(ArrayList<Tarea> listaTareas) {
		
		for (Tarea tarea : listaTareas) {
			if(tarea.getTipoTarea().equalsIgnoreCase("Bug")) {
				System.out.println("Prioridad alta");
			}else if(tarea.getTipoTarea().equalsIgnoreCase("Feature")) {
				System.out.println("Prioridad media");
			}else if(tarea.getTipoTarea().equalsIgnoreCase("Documentation")) {
				System.out.println("Prioridad baja");
			}
		}
		
	}

}
