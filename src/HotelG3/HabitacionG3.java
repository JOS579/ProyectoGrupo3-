package HotelG3;

import java.util.List;

import HotelG3.HabitacionG3;


public class HabitacionG3 {

    private ClienteG3 ocupante;
    private int numero, piso;
    private boolean estado;
    private String tipo;
    private double precio;
    private int fecha;
    private int fechar;
    

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public enum Tipo {
        PERSONAL,
        FAMILIAR,
        MATRIMONIAL
    }

    public int getNumero() {
        return numero;
    }

    public ClienteG3 getOcupante() {
        return ocupante;
    }

    public void setOcupante(ClienteG3 ocupante) {
        this.ocupante = ocupante;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
        public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getFechar() {
        return fechar;
    }

    public void setFechar(int fechar) {
        this.fechar = fechar;
    }

    public static boolean verificarNuevoHabitación(int numero) {
        List<HabitacionG3> lista = ListaHabitacionG3.Obtener();
        HabitacionG3 user;
        try {
            for (int i = 0; i < lista.size(); i++) {
                user = lista.get(i);
                if (user.getNumero() == numero) {
                    return false;
                }

            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

}