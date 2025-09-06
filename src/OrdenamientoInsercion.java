import java.util.Random;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[100];

        //generar números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        //mostrar arreglo desordenado
        System.out.println("Arreglo desordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();//salto de linea

        //medir tiempo antes
        long inicio = System.nanoTime();

        //algoritmo Ordenamiento Inserción
        //es el que mas me costó entender (aun no lo entiendo)
        for (int i = 1; i < numeros.length; i++) {
            int key = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = key;
        }

        //convertir los nanosegundos a segundos
        long fin = System.nanoTime();
        double duracion = (fin - inicio) / 1_000_000_000.0;
        System.out.println("Tiempo de ejecución del método Inserción: " + duracion + " segundos");
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}