package HotelG3;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarioG3 {

	private static List<UsuarioG3> datos = new ArrayList<UsuarioG3>();

	public static void Agregar(UsuarioG3 usuario) {
		datos.add(usuario);
	}

	public static void Eliminar(int posicion) {
		datos.remove(posicion);
	}

	public static UsuarioG3 getUsuarioPosicion(int posicion) {
		return datos.get(posicion);
	}

	public static List<UsuarioG3> Obtener() {
		return datos;
	}

	public static void Colocar(List<UsuarioG3> datos) {
		ListaUsuarioG3.datos = datos;
	}

}

