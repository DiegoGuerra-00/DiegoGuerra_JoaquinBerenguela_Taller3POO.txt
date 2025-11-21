package taller3;

import java.util.ArrayList;

public class PrioridadPorComplejidadStrategy implements PrioridadStrategy{

	@Override
	public void asignarPrioridad(ArrayList<Tarea> listaTareas) {
		
		for (Tarea tarea : listaTareas) {
			
			if(tarea.getComplejidad().equalsIgnoreCase("ALTA")) {
				System.out.println("Prioridad alta");
			}else if(tarea.getComplejidad().equalsIgnoreCase("MEDIA")) {
				System.out.println("Prioridad media");
			}else if(tarea.getComplejidad().equalsIgnoreCase("BAJA")) {
				System.out.println("Prioridad baja");
			}
			
			
		}
		
	}
}
