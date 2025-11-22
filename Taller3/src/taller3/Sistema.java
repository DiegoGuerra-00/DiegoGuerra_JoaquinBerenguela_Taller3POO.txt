// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

public interface Sistema {
	void mostrarListaProyectos();
	void filtrarTareasUsuario();
	void actualizarEstadoTarea();
	void aplicarVisitorTareas();
	
	void mostrarTodosProyectosTareas();
	void agregarOEliminarProyectosYTareasAsociadas();
	void agregarOEliminarTareaProyecto();
	void asignarPrioridadesStrategy();
	void generarReporteProyecto();
	
	void agregarUsuario(String usuario,String contraseña,String rol);
	void agregarProyecto(String idProyect,String NombreProyect, String usuarioProyecto);
	void agregarTareas(String proyecto, String idTarea,String tipo, String descripcion, String estado, String responsable, String complejidad, String fecha );
	
	void setPrioridadStrategy(PrioridadStrategy strategy);
	


}

