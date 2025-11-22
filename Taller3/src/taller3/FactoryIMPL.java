// Diego Benjamin Guerra Estay 21686594-4 ICCI
// Joaquin Antonio Berenguela Caimanque 21708988-3  



package taller3;

public class FactoryIMPL implements Factory {

	@Override
	public Usuario crearUsuario(String usuario, String contraseña, String rol) {
		return new Usuario(usuario, contraseña, usuario);
	}

	@Override
	public Proyecto crearProyecto(String idProyect, String NombreProyect, String usuarioProyecto) {
		return new Proyecto(idProyect, NombreProyect, NombreProyect);
	}

	@Override
	public Tarea crearTareas(String proyecto, String idTarea, String tipo, String descripcion, String estado,
			String responsable, String complejidad, String fecha) {
		return new Tarea(proyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
	}

}

