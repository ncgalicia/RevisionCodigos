<!---Me califico Karen Pineda  5/ 5-->
package com.revisionCodigo;

///importe el Scanner
import java.util.Scanner;

public class Codigo4 {
	// Agregue el main
	public static void main(String[] args) {
		// Agregue (System.in);
		Scanner s = new Scanner(System.in);
		// elimine

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		//cambie 1 por el numero 2 
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// Agregue (System.in);
		// pero no vi necesrio otro Scanner
		//Scanner s2 = new Scanner(System.in);
		String j2 = s.nextLine();
		//cerre scanner
		s.close();
		
		// quite un parentesis de mas
		if (j1 == j2) {
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2 == "tijeras") {
					g = 1;
				}

			case "papel":
				if (j2 == "piedra") {
					g = 1;
					// Agregue un llave
				}
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}

	}
}
