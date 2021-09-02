package HotelG3;

import java.util.ArrayList;
import java.util.List;

public class ListaHabitacionG3{

    private static List<HabitacionG3> datosG3 = new ArrayList<HabitacionG3>();

    public static void Agregar(HabitacionG3 habitacion) {
        datosG3.add(habitacion);
    }

    public static void Eliminar(int numero) {
        for (int i = 0; i < datosG3.size(); i++) {
            if (datosG3.get(i).getNumero() == numero) {
                datosG3.remove(i);
            }
        }
    }

    public static HabitacionG3 ObtenerHabitacionPos(int pos) {
        return datosG3.get(pos);
    }

    public static HabitacionG3 ObtenerHabitacionNum(int numero) {
        for (int i = 0; i < datosG3.size(); i++) {
            if (datosG3.get(i).getNumero() == numero) {
                return datosG3.get(i);
            }
        }
        return null;
    }

    public static List<HabitacionG3> Obtener() {
        return datosG3;
    }
    
    public static void Colocar(List<HabitacionG3> datos) {
        ListaHabitacionG3.datosG3 = datos;
    } 
}
