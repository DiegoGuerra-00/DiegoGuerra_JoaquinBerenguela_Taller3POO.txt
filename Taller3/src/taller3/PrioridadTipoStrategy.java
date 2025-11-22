// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

import java.util.ArrayList;

public class PrioridadTipoStrategy implements PrioridadStrategy{// se implementa la interfaz para realizar el strategy

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


