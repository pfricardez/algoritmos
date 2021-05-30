package io.sewsol.algoritmos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortBTest {

    @Test
    public void ordenamientoMinimo() {

        QuickSortB algoritmo = new QuickSortB();

        assertArrayEquals(new int[] { 1 }, algoritmo.ordenar(new int[] { 1 }), "Ordenamiento minimo");

    }

    @Test
    public void ordenamientoImpar() {

        QuickSortB algoritmo = new QuickSortB();

        assertArrayEquals(new int[] { 1, 3, 5 }, algoritmo.ordenar(new int[] { 5, 1, 3}), "Ordenamiento impar");

    }

    @Test
    public void ordenamientoPar() {

        QuickSortB algoritmo = new QuickSortB();

        assertArrayEquals(new int[] { 10, 17, 33, 34, 39, 51, 58, 100 }, algoritmo.ordenar(new int[] { 39, 33, 17, 51, 34, 100, 58, 10}), "Ordenamiento par");

    }
    
}
