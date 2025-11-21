package taller3;

import java.util.ArrayList;

public class PrioridadPorFechaCreacionStrategy implements PrioridadStrategy {

	@Override
	public void asignarPrioridad(ArrayList<Tarea> listaTareas) {
		
		for (Tarea tarea : listaTareas) {
			
			String[] separadorFecha = tarea.getFecha().split("-");
			
			int año = Integer.parseInt(separadorFecha[0]);
			int mes = Integer.parseInt(separadorFecha[1]);
			int dia = Integer.parseInt(separadorFecha[2]);
			
			
			
			
		}
		
	}

	
}
