package io.sewsol.algoritmos;

import java.util.Arrays;

/**
 * Este algoritmo de ordenacion es de complejidad Big O(n Log n)
 * Tomado del libro de algoritmos de CLRS y de la pagina web: https://www.geeksforgeeks.org/quick-sort/
 */
public class QuickSortB {
    
    public int[] ordenar(int[] arr) {

        System.out.println("Antes: " +Arrays.toString(arr));

        ordenar(arr, 0, arr.length-1);
        System.out.println("Despues: " + Arrays.toString(arr));

        return arr;

    }


    private void ordenar(int[] arr, int p, int r) {

        if ( p < r ) {

            int q = particionar(arr, p, r);

            ordenar(arr, p, q-1);
            ordenar(arr, q+1, r);

        }

    }

    private int particionar(int[] arr, int p, int r) {

        int x = arr[r];

        int i = p - 1;

        for(int j=p; j<= r; j++) {

            if( arr[j] < x ) {

                i++;

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

            }
        }

        int t = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = t;

        return i+1;

    }


}
