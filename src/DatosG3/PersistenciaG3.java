package DatosG3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

import HotelG3.HabitacionG3;
import HotelG3.ListaHabitacionG3;
import HotelG3.ListaUsuarioG3;
import HotelG3.UsuarioG3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PersistenciaG3 {

	private List<HabitacionG3> listaDeHabitacioG3 = new ArrayList<>();

	private List<UsuarioG3> listaDeUsuarioG3 = new ArrayList<>();

	public List<HabitacionG3> getListaDeHabitacioes() {
		return listaDeHabitacioG3;
	}

	public void setListaDeHabitacioes(List<HabitacionG3> listaDeHabitacioes) {
		this.listaDeHabitacioG3 = listaDeHabitacioes;
	}

	public List<UsuarioG3> getListaDeUsuarios() {
		return listaDeUsuarioG3;
	}

	public void setListaDeUsuarios(List<UsuarioG3> listaDeUsuarios) {
		this.listaDeUsuarioG3 = listaDeUsuarios;
	}

	public static void guardarDatos() throws IOException {

		PersistenciaG3 nuevo = new PersistenciaG3();

		nuevo.setListaDeHabitacioes(ListaHabitacionG3.Obtener());
		nuevo.setListaDeUsuarios(ListaUsuarioG3.Obtener());

		try (JsonWriter jsonWriter = new JsonWriter(new FileWriter("Grupo3.json"))) {
			jsonWriter.setIndent("    ");
			Gson jsonString = new GsonBuilder().serializeNulls().create();
			jsonString.toJson(nuevo, PersistenciaG3.class, jsonWriter);
		}
	}

	public static void CargarDatos() throws IOException {

		File archivo = new File("Grupo3.json");
		if (archivo.exists()) {

			StringBuilder stringBuilder;
			try (BufferedReader reader = new BufferedReader(new FileReader("Grupo3.json"))) {
				stringBuilder = new StringBuilder();
				String line;
				String ls = System.getProperty("line.separator");
				while ((line = reader.readLine()) != null) {
					stringBuilder.append(line);
					stringBuilder.append(ls);
				}
				stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			}
			String texto = stringBuilder.toString();

			Gson json = new Gson();

			PersistenciaG3 guardar = json.fromJson(texto, PersistenciaG3.class);

			ListaHabitacionG3.Colocar(guardar.getListaDeHabitacioes());
			ListaUsuarioG3.Colocar(guardar.getListaDeUsuarios());

		} else {
			JOptionPane.showInternalMessageDialog(null, "Bienvenido.");
		}
	}
}
