import java.util.Random;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Random random = new Random();//me advierte que no es necesario crear un objeto Random, pero lo quito y no funciona jaja
        int[] numeros = new int[100];

        //generar números aleatorios entre 1 y 100 mismo que el archivo anterior
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        //mostrar arreglo desordenado mismo que el archivo anteriorx2
        System.out.println("Arreglo desordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();//salto de linea

        //medir tiempo antes
        long inicio = System.nanoTime();

        //algoritmo Ordenamiento Selección
        for (int i = 0; i < numeros.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }

            //intercambiar el elemento mínimo con el primer elemento no ordenado
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }

        //convertir los nanosegundos a segundos
        long fin = System.nanoTime();
        double duracion = (fin - inicio) / 1_000_000_000.0;
        System.out.println("Tiempo de ejecución del método Selección: " + duracion + " segundos");
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}