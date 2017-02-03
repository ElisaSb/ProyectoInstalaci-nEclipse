
public class TestPalabra {
	public static void main(String[] args) {
		String palabraPrueba = "luna ";
		Palabra palabra = new Palabra(palabraPrueba.trim());
		System.out.printf("%s\n", palabra);
		System.out.printf("Palabra en may�scula: %s\n", palabra.convertirContenidoMayuscula());
		System.out.printf("Palabra en min�scula: %s\n", palabra.convertirContenidoMinuscula());	
		System.out.printf("N�mero de letras de la palabra: %d\n", palabra.contarLetras());
		System.out.printf("Primera letra de la palabra en min�scula: %c\n", palabra.devolverPrimeraLetraMinuscula());
		System.out.printf("�ltima letra de la palabra en may�scula: %c\n", palabra.devolverUltimaLetraMayuscula());
		System.out.printf("Palabra reemplazada: %s\n", palabra.reemplazarLetrasContenido('u', 'Z'));
	}
}