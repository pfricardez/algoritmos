package io.sewsol.algoritmos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class QuickSortTest {

    @Test
    public void ordenarMinimo() {

        QuickSort algoritmo = new QuickSort();

        int[] sortedData = algoritmo.ordenar(new int[] {20});

        assertArrayEquals(new int[] { 20 }, 
            sortedData,
            "Ordenacion minima");

    }

    @Test
    public void ordenarImpar() {

        QuickSort algoritmo = new QuickSort();

        int[] sortedData = algoritmo.ordenar(new int[] {20, 1, 5, 15, 10});

        assertArrayEquals(new int[] {
            1, 5, 10, 15, 20  }, 
            sortedData,
            "Ordenacion conjunto impar");

    }

    @Test
    public void ordenarPar() {

        QuickSort algoritmo = new QuickSort();

        int[] sortedData = algoritmo.ordenar(new int[] {100, 25, 40, 43,  1, 8, 59, 14, 31, 69});

        assertArrayEquals(new int[] {
            1, 8, 14, 25, 31, 40, 43, 59, 69, 100  }, 
            sortedData,
            "Ordenacion conjunto par");

    }


}