package TestU;


import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import HotelG3.ClienteG3;
import HotelG3.HabitacionG3;

import HotelG3.PersonaG3;


 class TestClases {


	@Test
	 void testCliente() {
		
		ClienteG3 test= new ClienteG3();
		//assertFalse sirve para afirmar que un tipo de dato u objeto es falso
		assertFalse( "Nombre del ocupante", test.getDatos( ).equals( "Josseph" ) );
		assertFalse( "Apellido del ocupante", test.getDatos( ).equals( "Cedeño" ) );
	    assertFalse( "Edad del ocupante", test.getDatos( ).equals( "20" ) );
	    assertFalse( "Numero de celular", test.getDatos( ).equals( "0983600612" ) );
	    assertFalse( "Numero de cedula", test.getDatos( ).equals( "0706753175" ) );
	    assertFalse( "Personas en la habitacion", test.getDatos( ).equals( "5" ) );
	  //Atributos del cliente en el sistema
	}
	@Test
	 void testHabitacion() {
		
		HabitacionG3 test= new HabitacionG3();
		//assertFalse sirve para afirmar que un tipo de dato u objeto es falso
		assertFalse( "Piso", test.getPiso( ) == 1 );
		assertFalse( "Precio", test.getPrecio( ) == 23.5 );
		assertFalse( "Piso", test.getNumero( ) == 4 );
	    assertFalse( "Fecha de ingreso", test.getFecha( ) == 25 );
	    assertFalse( "Fecha de retiro", test.getFechar( ) == 30 );
	  //Datos del reguisto de habitacion
	}
	
	@Test
	public void testPersona() {
		
		PersonaG3 test1= new PersonaG3();
		//assertFalse sirve para afirmar que un tipo de dato u objeto es falso
	    assertFalse( "Edad de la persona", test1.getEdad( ) == 20 );
	  //Edad de la persona
	}
	
	
}
