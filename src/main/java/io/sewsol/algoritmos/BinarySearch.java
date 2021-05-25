package io.sewsol.algoritmos;


/**
 * Este algoritmo es de complejidad Big O(Log n)
 * Divide el set de datos a la mitad y pregunta por el valor en la posicion media para decidir si busca 
 * en la mitad inicial o final.
 * Los datos deben estar ordenados
 */
public class BinarySearch {

    public static int contador = 0;

    public int buscarLineal(int[] datos, int objetivo) {
        BinarySearch.contador = 0;
        int low = 0;
        int high = datos.length-1;
        int mid = -1;

        while ( low <= high ) {
            BinarySearch.contador++;
            mid = (low + high) / 2;

            if (datos[mid] == objetivo) break;

            if (datos[mid] > objetivo) 
                high = mid-1;
            else 
                low = mid+1;

        }

        if (datos[mid] == objetivo) return mid;
        else return -1;

    }

    public int buscarRecursivo(int[] datos, int objetivo) {
        BinarySearch.contador = 0;
        return buscarRecursivo(datos, objetivo, 0, datos.length-1);
    } 


    private int buscarRecursivo(int[] datos, int objetivo, int inicio, int fin) {

        BinarySearch.contador++;

        int mid = (inicio + fin) / 2;
        if ( datos[mid] == objetivo) return mid;

        if ( mid == 0 || mid == fin) return -1;

        if ( datos[mid] > objetivo) return buscarRecursivo(datos, objetivo, inicio, mid);
        else return buscarRecursivo(datos, objetivo, mid+1, fin);

    }

    
}
