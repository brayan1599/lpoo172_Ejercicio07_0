/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_01;

import java.util.Scanner;


public class Ejercicio_07_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Mostar el mensaje al usuario
		System.out.print("Ingrese el numero de estudiantes: ");
		int[] notas = new int[input.nextInt()];
		char[] puntajes = new char[notas.length];

		
		System.out.print("Ingrese " + notas.length + " notas: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = input.nextInt();
		}

		
		getGrades(notas, puntajes);

		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Estudiantes " + i + " nota es " + 
				notas[i] + " y su puntaje es " + puntajes[i]);
		}
	}

	/** Method max returns the is highest score */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	/** Method getGrade assigns grades based on grading scheme */
	public static void getGrades(int[] notas, char[] puntajes) {
		int best = max(notas);
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= best - 10)
				puntajes[i] = 'A';
			else if (notas[i] >= best - 20)
				puntajes[i] = 'B';
			else if (notas[i] >= best - 30)
				puntajes[i] = 'C';
			else if (notas[i] >= best - 40)
				puntajes[i] = 'D';
			else
				puntajes[i] = 'F';
		}
	} 
}
    
    
