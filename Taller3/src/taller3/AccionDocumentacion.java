// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

import java.util.ArrayList;


public class AccionDocumentacion implements Visitor{

	@Override
	public void visit(Tarea tarea) {
		
		System.out.println("Tipo de tarea: Documentacion");
		String tipotarea = tarea.getTipoTarea();
		if(tipotarea.equalsIgnoreCase("Documentacion")) {
			System.out.println("-->  Mejora la calidad del proyecto "+" '"+tarea.getDescripcionTarea()+"'");

		}
		System.out.println();
	}
	
}

