import java.util.Random;

public class NumAleatorios {

    // Generar un array de enteros aleatorios entre 0 y e maximo valor 
    public static int[] generarArray(int n, int maxValor) {
        Random rand = new Random();
        int[] arre = new int[n];
        for (int i = 0; i < n; i++) {
            arre[i] = rand.nextInt(maxValor + 1); 
        }
        return arre;
    }

    // Calcular la media aritmética
    public static double calcularMedia(int[] arre) {
        int suma = 0;
        for (int num : arre) {
            suma += num;
        }
        return (double) suma / arre.length;
    }

    // Encontrar el valor máximo
    public static int encontrarMaximo(int[] arre) {
        int max = arre[0];
        for (int num : arre) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Encontrar el valor mínimo
    public static int encontrarMinimo(int[] arre) {
        int min = arre[0];
        for (int num : arre) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Calcular la desviación estándar (con ayuda de chat gpt este)
    public static double calcularDesviacionEstandar(int[] arre) {
        double media = calcularMedia(arre);
        double sumaCuadrados = 0;
        for (int num : arre) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / (arre.length - 1));
    }

    // ejecutable
    public static void main(String[] args) {
        int[] datos = generarArray(10, 100); // 10 num entre 0 y 100

        // Mostrar array
        System.out.print("Array generado: ");
        for (int num : datos) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Media: " + calcularMedia(datos));
        System.out.println("Máximo: " + encontrarMaximo(datos));
        System.out.println("Mínimo: " + encontrarMinimo(datos));
        System.out.println("Desviación estándar: " + calcularDesviacionEstandar(datos));
    }
}
