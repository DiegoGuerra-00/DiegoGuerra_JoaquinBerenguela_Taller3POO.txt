// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  


package taller3;

public interface Factory { // se crea una interfaz que para la creacion de instancias 
	Usuario crearUsuario(String usuario,String contraseña,String rol);
	Proyecto crearProyecto(String idProyect,String NombreProyect, String usuarioProyecto);
	Tarea crearTareas(String proyecto, String idTarea,String tipo, String descripcion, String estado, String responsable, String complejidad, String fecha );
	
	

}


