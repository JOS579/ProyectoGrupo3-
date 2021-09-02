package HotelG3;

public class ClienteG3 extends PersonaG3{
    
    private int numeroPersonas;

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }    
    
    public String getDatos(){
        String texto = "Nombres: \n" + this.nombre
                + "\nApellidos: \n" + this.apellido 
                + "\nEdad: \n" + this.edad
                + "\nTelefono: \n" + this.numeroTelefono
                + "\nCedula: \n" + this.Ci
                + "\nNumero de Personas: \n" + this.numeroPersonas;
        return texto;
    }
}