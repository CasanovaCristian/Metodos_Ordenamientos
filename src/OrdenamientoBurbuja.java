import java.util.Random;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[100];

        // Generar números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        // Mostrar arreglo desordenado
        System.out.println("Arreglo desordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();//esta linea es para hacer un salto de linea

        // Medir tiempo antes
        long inicio = System.nanoTime();

        // Algoritmo Ordenamiento Burbuja (mismo de la clase)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        //convertir los nanosegundos a segundos
        long fin = System.nanoTime();
        double duracion = (fin - inicio) / 1_000_000_000.0;//No tenia idea que existia esa notacion de guion bajo
        System.out.println("Tiempo de ejecución del método Burbuja: " + duracion + " segundos");
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}