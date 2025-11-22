// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

import java.util.ArrayList;

public class AccionBug implements Visitor // se implementa el visitor

	@Override
	public void visit(Tarea tarea) { // se procede printear por pantalla el mensaje si es que el objeto es de tipo bug
		System.out.println("Tipo de tarea: bug");
		String tipoTarea = tarea.getTipoTarea();
		if(tipoTarea.equals("Bug")) {
			System.out.println("--> Afecta criticidad del proyecto "+" '"+tarea.getDescripcionTarea()+"'");
		}
		System.out.println();
	
		
	}

}


