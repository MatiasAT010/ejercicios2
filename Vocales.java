import java.util.Scanner;

public class Vocales {

    // Leer cadena desde consola
    public static String leerCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextLine().trim().replaceAll("\\s+"," ");
    }

    // Contar vocales
    public static int contarVocales(String s) {
        String vocales = "aeiouAEIOU";
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vocales.indexOf(s.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

	  // Invertir cadena
    public static String invertirCadena(String s) {
        char[] c = s.toCharArray();
        String invertida = "";
        for (int i = c.length - 1; i >= 0; i--) {
            invertida += c[i];
        }
        return invertida;
    }

    // Verificar si es palíndromo
    public static boolean esPalindromo(String s) {
       
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    
    
       //Ejecutamos
    public static void main(String[] args) {
        String texto = leerCadena("Hola, ingresa un texto: ");

        System.out.println("Vocales: " + contarVocales(texto));
        System.out.println("Texto invertido: " + invertirCadena(texto));
        System.out.println("¿Es palíndromo? " + (esPalindromo(texto) ? "Sí" : "No"));
    }
}
