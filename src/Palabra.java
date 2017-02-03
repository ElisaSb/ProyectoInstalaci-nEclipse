
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
	//un m�todo que devuelva la palabra en mayucula
	public String convertirContenidoMayuscula(){
		return contenido.toUpperCase();
	}
	//m�todo que devuelva la palabra en minuscula
	public String convertirContenidoMinuscula(){
		return contenido.toLowerCase();
	}
	//m�todo para contar las letras de la palabra
	public int contarLetras() {
		return contenido.length();
	}
	//m�todo para reemplazar letras
	public String reemplazarLetrasContenido(char oldChar, char newChar) {
		return contenido.replace(oldChar, newChar);
	}
	//m�todo devolvemos la primera letra del contenido en min�scula
	public char devolverPrimeraLetraMinuscula() {
		return contenido.toLowerCase().charAt(0);
	}
	//m�todo devolvemos la ultima letra del contenido en may�scula
	public char devolverUltimaLetraMayuscula() {
		return contenido.toUpperCase().charAt(contenido.length()-1);
	}
	
	//crear main para comprobar que funciona
	/*public static void main(String[] args) {
		Palabra p = new Palabra("luna");
		System.out.println(p);
	}*/
}
