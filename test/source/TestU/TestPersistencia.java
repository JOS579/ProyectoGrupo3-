package TestU;

import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;

import DatosG3.PersistenciaG3;


class TestPersistencia {

	@Test
	 void testPersistencia() {
		
		PersistenciaG3 test= new PersistenciaG3();
		//assertFalse sirve para afirmar que un tipo de dato u objeto es falso
		assertFalse( "Lista de habitacion", test.getListaDeHabitacioes( ).equals( "Habiacion1" ) );
		assertFalse( "Lista de Usuario", test.getListaDeUsuarios( ).equals( "Josseph" ) );
		//Lista de datos para el fichero Json
	    
	}

}
