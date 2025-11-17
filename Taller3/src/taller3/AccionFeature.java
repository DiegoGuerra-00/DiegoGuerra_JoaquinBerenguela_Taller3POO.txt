package taller3;

import java.util.ArrayList;

public class AccionFeature implements Visitor{

	@Override
	public void visit(Tarea tarea) {
		System.out.println("Tipo de tarea: Feature");
		String tipotarea = tarea.getTipoTarea();
		if(tipotarea.equalsIgnoreCase("Feature")) {
			System.out.println("-->  Impacta en la estimación de tiempo del proyecto"+" '"+tarea.getDescripcionTarea()+"'");
		}
		System.out.println();
		
	}

}
