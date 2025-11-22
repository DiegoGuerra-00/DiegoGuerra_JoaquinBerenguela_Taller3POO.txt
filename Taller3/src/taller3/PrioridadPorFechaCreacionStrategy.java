// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  


package taller3;

import java.util.ArrayList;

public class PrioridadPorFechaCreacionStrategy implements PrioridadStrategy {

	@Override
	public void asignarPrioridad(ArrayList<Tarea> listaTareas) {
	
		System.out.println("=== Prioridad según fecha (más antigua = mayor prioridad) ===\n");

        boolean[] verificarFechasIguales = new boolean[listaTareas.size()];

        for (int i = 0; i < listaTareas.size(); i++) {

            int indiceMasAntigua = -1;
            int fechaMasAntigua = Integer.MAX_VALUE; 

            for (int j = 0; j < listaTareas.size(); j++) {

                if (verificarFechasIguales[j]) continue; 

                String[] partes = listaTareas.get(j).getFecha().split("-");

                int año = Integer.parseInt(partes[0]);
                int mes  = Integer.parseInt(partes[1]);
                int dia  = Integer.parseInt(partes[2]);

                int fechaN = (año * 10000) + (mes * 100) + dia;

                if (fechaN < fechaMasAntigua) {
                    fechaMasAntigua = fechaN;
                    indiceMasAntigua = j;
                }
            }

            verificarFechasIguales[indiceMasAntigua] = true;

            Tarea tarea = listaTareas.get(indiceMasAntigua);

            System.out.println(
                    (i + 1) + ") " + tarea.getDescripcionTarea()
                    + " | Fecha: " + tarea.getFecha()
                    + " | PRIORIDAD N° " + (i + 1)
            );
        }
    }
}
	


