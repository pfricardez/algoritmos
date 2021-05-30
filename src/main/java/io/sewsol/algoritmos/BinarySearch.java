package io.sewsol.algoritmos;


/**
 * Este algoritmo es de complejidad Big O(Log n)
 * Divide el set de datos a la mitad y pregunta por el valor en la posicion media para decidir si busca 
 * en la mitad inicial o final.
 * Los datos deben estar ordenados
 */
public class BinarySearch {


    public int buscarLineal(int[] datos, int objetivo) {
        int limite_inferior = 0;
        int limite_superior = datos.length-1;
        int no_encontrado = -1;
        int mid = no_encontrado;

        while ( limite_inferior < limite_superior ) {
            mid = (limite_inferior + limite_superior) / 2;   //calcula el punto medio de busqueda

            if (datos[mid] == objetivo) break;   //encontro el valor objetivo

            if (datos[mid] > objetivo)  //el objetivo se encuentra antes del punto medio
                limite_superior = mid + 1;   //el limite superior de busqueda se ajusta abajo del punto medio inicial
            else  //el objetivo se encuentra despues del punto medio
                limite_inferior = mid - 1;   //el limite inferior de busqueda se ajusta arriba del punto medio inicial

        }

        if (datos[mid] == objetivo) return mid;  //encontro el valor objetivo y devuelve el indice de su posicion
        else return no_encontrado;  

    }

    public int buscarRecursivo(int[] datos, int objetivo) {
        return buscarRecursivo(datos, objetivo, 0, datos.length-1);
    } 


    private int buscarRecursivo(int[] datos, int objetivo, int inicio, int fin) {

        int mid = (inicio + fin) / 2;
        if ( datos[mid] == objetivo) return mid;

        if ( mid == 0 || mid == fin) return -1;

        if ( datos[mid] > objetivo) return buscarRecursivo(datos, objetivo, inicio, mid);
        else return buscarRecursivo(datos, objetivo, mid+1, fin);

    }

    
}
