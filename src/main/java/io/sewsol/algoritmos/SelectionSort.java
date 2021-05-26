package io.sewsol.algoritmos;

import java.util.Arrays;

/**
 * Este algoritmo de ordenacion de complejidad Big O(n*n)
 */
public class SelectionSort {
 
    public int[] ordenar(int[] data) {

        int swap = 0;

        for(int i=0; i<data.length-1; i++) {

            int smallest = i;
            for(int j=i+1; j<data.length; j++) {

                if ( data[j] < data[smallest])
                    smallest = j;

            }

            if (smallest != i) {

                swap = data[i];
                data[i] = data[smallest];
                data[smallest] = swap;

            }

        }

        return data;
    }

}
