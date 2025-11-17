package taller3;

import java.util.ArrayList;

public class AccionBug implements Visitor{

	@Override
	public void visit(Tarea tarea) {
		System.out.println("Tipo de tarea: bug");
		String tipoTarea = tarea.getTipoTarea();
		if(tipoTarea.equals("Bug")) {
			System.out.println("--> Afecta criticidad del proyecto "+" '"+tarea.getDescripcionTarea()+"'");
		}
		System.out.println();
	
		
	}

}
