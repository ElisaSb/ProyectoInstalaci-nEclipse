
public class TestPersona {
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Elisa", 20);
		System.out.println("Persona 1 con nombre: " + persona1.getNombre() + ", de edad: " + persona1.getEdad());
		//Cambio de edad
		persona1.setEdad(21);
		System.out.println("Persona 1 con nombre: " + persona1.getNombre() + ", de edad: " + persona1.getEdad());
		System.out.println(persona1);
	}
}