// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



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

