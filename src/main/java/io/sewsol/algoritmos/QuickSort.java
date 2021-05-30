package io.sewsol.algoritmos;

import java.util.*;

/**
 * Este algoritmo de ordenacion es de complejidad Big O(n Log n)
 */
public class QuickSort {

    public  int[] ordenar(int[] datos) {

        System.out.println("Antes: " +Arrays.toString(datos));

        int[] r = quickSort(datos);

        System.out.println("Despues: " + Arrays.toString(r));

        return r;

    }

    private int[] quickSort(int[] datos) {

        if (datos.length < 2) return datos;

        int pivote = datos[0];

        int[] menores = new int[datos.length];
        int[] mayores = new int[datos.length];      

        int x = 0;
        int y = 0;

        for(int i=1; i< datos.length; i++) {

            if ( pivote > datos[i])
                menores[x++] = datos[i];
            else 
                mayores[y++] = datos[i];

        }

        menores = quickSort(Arrays.copyOfRange(menores, 0, x));
        mayores = quickSort(Arrays.copyOfRange(mayores, 0, y));

        System.arraycopy(menores, 0, datos, 0, x);
        System.arraycopy(mayores, 0, datos, x+1, y);
        datos[x]=pivote;

        return datos;

    }

     
}
