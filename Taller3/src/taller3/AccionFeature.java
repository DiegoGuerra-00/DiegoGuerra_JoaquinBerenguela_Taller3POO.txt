// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

import java.util.ArrayList;

public class AccionFeature implements Visitor{ // se implementa interfaz visitor 

	@Override
	public void visit(Tarea tarea) {//si el objeto es de tipo feature se procede a printerar por pantalla el mensaje 
		System.out.println("Tipo de tarea: Feature");
		String tipotarea = tarea.getTipoTarea();
		if(tipotarea.equalsIgnoreCase("Feature")) {
			System.out.println("-->  Impacta en la estimación de tiempo del proyecto"+" '"+tarea.getDescripcionTarea()+"'");
		}
		System.out.println();
		
	}

}


