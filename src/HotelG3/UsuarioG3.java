package HotelG3;

import java.util.List;

import HotelG3.UsuarioG3;

public class UsuarioG3 extends PersonaG3 {

    private String usuario;
    private String contra;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }


    public void crearUsuario(String usuario, String contra) {

    }

    public static List<UsuarioG3> ObtenerUsuarios() {
        return ListaUsuarioG3.Obtener();
    }

    public static boolean verificarNuevoUsuario(String usuario) {
        List<UsuarioG3> lista = ObtenerUsuarios();
        UsuarioG3 user;
        for (int i = 0; i < lista.size(); i++) {
            user = lista.get(i);
            if (user.getUsuario().equalsIgnoreCase(usuario)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean verificarUsuario(String usuario, String contraseña) {
        List<UsuarioG3> lista = ObtenerUsuarios();
        UsuarioG3 user;
        for (int i = 0; i < lista.size(); i++) {
            user = lista.get(i);
            if (user.getUsuario().equalsIgnoreCase(usuario) && user.getContra().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
    public static int obtenerPOS(String usuario, String contraseña) {
        List<UsuarioG3> lista = ObtenerUsuarios();
        UsuarioG3 user;
        for (int i = 0; i < lista.size(); i++) {
            user = lista.get(i);
            if (user.getUsuario().equalsIgnoreCase(usuario) && user.getContra().equals(contraseña)) {
                return i;
            }
        }
        return 0;
    }
}

