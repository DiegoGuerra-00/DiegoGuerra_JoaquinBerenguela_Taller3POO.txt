package taller3;

import java.util.ArrayList;

public class PrioridadTipoStrategy implements PrioridadStrategy{

	@Override
	public void asignarPrioridad(ArrayList<Tarea> listaTareas) {
		
		for (Tarea tarea : listaTareas) {
			if(tarea.getTipoTarea().equalsIgnoreCase("Bug")) {
				System.out.println(tarea.getDescripcionTarea() + "  |  " + "Prioridad alta");
			}else if(tarea.getTipoTarea().equalsIgnoreCase("Feature")) {
				System.out.println(tarea.getDescripcionTarea() + "  |  " + "Prioridad media");
			}else if(tarea.getTipoTarea().equalsIgnoreCase("Documentacion")) {
				System.out.println(tarea.getDescripcionTarea() + "  |  " + "Prioridad baja");
			}
		}
		
	}

}
