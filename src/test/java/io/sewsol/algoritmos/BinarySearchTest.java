package io.sewsol.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	public void busquedaLineal() {

		BinarySearch algoritmo = new BinarySearch();

		int target = 10;
		int posicion = algoritmo.buscarLineal(generarData(), target);
		
		assertEquals(target-1, posicion, "Busqueda Lineal");

	}

	@Test
	public void busquedaRecursiva() {

		BinarySearch algoritmo = new BinarySearch();

		int target = 10;
		int posicion = algoritmo.buscarRecursivo(generarData(), target);

		assertEquals(target-1, posicion, "Busqueda Recursiva");

	}

	private static int[] generarData() {

		int[] data = new int[128];

		Arrays.fill(data, 1);

		Arrays.setAll(data, x -> data[x]+x);

		return data;
	}

}
