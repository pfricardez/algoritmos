package io.sewsol.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {


    @Test
    public void testSimpleSort() {

        SelectionSort algoritmo = new SelectionSort();

        int[] dataUnsorted = new int[] {20, 1, 9, 10, 5, 1};
        int[] dataExpected = new int[] {1, 1, 5, 9, 10, 20};
        int[] dataSorted = algoritmo.ordenar(dataUnsorted);

        boolean isEquals = Arrays.equals(dataExpected, dataSorted);
        assertEquals(true, isEquals, "Simple sort");

    }
    
}
