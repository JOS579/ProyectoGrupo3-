package InterfazG3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DatosG3.PersistenciaG3;

public class HotelG3 extends JFrame{

	public HotelG3() {
	}

public static void main(String[] args) {
    	
    	try {
        	PersistenciaG3.CargarDatos();
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Error:  " + e);
		}

        LoginG3 ventana = new LoginG3();
    }
}