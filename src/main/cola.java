package main;

import java.util.LinkedList;
import java.util.Scanner;

import models.Estudiante;

public class cola {

	static LinkedList<Estudiante> lista;
	/**
	 * True LIFO False FIFO
	 */
	static boolean lifo = false;

	public static void main(String[] args) {
		/**
		 * Declaración de variables
		 */
		boolean atenderMas = true;
		String siguiente = "s";
		Scanner sc = new Scanner(System.in);

		/**
		 * Rellenar lista
		 */
		rellenarLista();

		/**
		 * Empezar a atender a alumnos!
		 */

		System.out.println("** Tutorator 2000! **");

		while (atenderMas) {
			System.out.println("¿Siguiente? -> ");
			siguiente = sc.next();
			if (atenderMas = siguiente.equalsIgnoreCase("s")) {
				System.out.println(atenderSiguiente());
			}
		}

	}

	public static Estudiante atenderSiguiente() {
		if (!lista.isEmpty()) {
			if (lifo) {
				return lista.removeLast();
			} else {
				return lista.removeFirst();
			}
		}
		return null;
	}

	public static void rellenarLista() {
		lista = new LinkedList<Estudiante>();
		lista.add(new Estudiante("Isma", "Burgos"));
		lista.add(new Estudiante("Zozan", "Fdez"));
		lista.add(new Estudiante("Peibol", "Castrillon"));
		lista.add(new Estudiante("Alfon", "Dguez"));
		lista.add(new Estudiante("Alberto", "Rama"));
		lista.add(new Estudiante("Sergio", "Pla"));
	}

}
