
public class Palabra {
	//atributos
	private String contenido;
	//constructor
	public Palabra(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Palabra [contenido=" + contenido + "]";
	}
	//un método que devuelva la palabra en mayucula
	public String convertirContenidoMayuscula(){
		return contenido.toUpperCase();
	}
	//método que devuelva la palabra en minuscula
	public String convertirContenidoMinuscula(){
		return contenido.toLowerCase();
	}
	//método para contar las letras de la palabra
	public int contarLetras() {
		return contenido.length();
	}
	//método para reemplazar letras
	public String reemplazarLetrasContenido(char oldChar, char newChar) {
		return contenido.replace(oldChar, newChar);
	}
	//método devolvemos la primera letra del contenido en minúscula
	public char devolverPrimeraLetraMinuscula() {
		return contenido.toLowerCase().charAt(0);
	}
	//método devolvemos la ultima letra del contenido en mayúscula
	public char devolverUltimaLetraMayuscula() {
		return contenido.toUpperCase().charAt(contenido.length()-1);
	}
	
	//crear main para comprobar que funciona
	/*public static void main(String[] args) {
		Palabra p = new Palabra("luna");
		System.out.println(p);
	}*/
}
