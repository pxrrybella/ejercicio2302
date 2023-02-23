package com.ejercicios2302.ejercicios2302;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ejercicios2302.ejercicios2302.models.Perro;
import java.util.Scanner;

@SpringBootApplication
public class Ejercicios2302Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList <Perro> misPerros = new ArrayList<Perro>();

		String respMenu = "S";

		System.out.println("**Programa de registro de perros**");
		System.out.println("A continuación, indique si quiere registrar un perro");
		do {
			System.out.println("Ingrese 'S' (sin comillas) para ingresar datos, 'N' para abandonar el programa: ");
			respMenu = teclado.nextLine();

			if (respMenu.equals("S")){
				Perro perroAux = new Perro();
				System.out.println("A continuación, ingrese el nombre del perro:");
				String nombre = teclado.nextLine();
				perroAux.setNombre(nombre);
				System.out.println("Ingrese la raza del perro:");
				String raza = teclado.nextLine();
				perroAux.setRaza(raza);
				System.out.println("Ingrese el color del perro:");
				String color = teclado.nextLine();
				perroAux.setColor(color);
				System.out.println("Ingrese el tamaño del perro en centímetros utilizando comas para los decimales:");
				Double tamanio = teclado.nextDouble();
				perroAux.setTamanio(tamanio);
				System.out.println("Ingrese F si el perro es femenino, M si es masculino");
				char sexo = teclado.next().charAt(0);
				teclado.nextLine();
				perroAux.setSexo(sexo);
				System.out.println("Ingrese el número correspondiente al chip:");
				Integer chip = teclado.nextInt();
				perroAux.setChip(chip);
				teclado.nextLine();

				misPerros.add(perroAux);
			} else if (respMenu.equals("N")){
				System.out.println("Muchas gracias.");
			} else {
				System.out.println("La letra ingresada no corresponde.");
			}

		} while (!respMenu.equals("N"));

		System.out.println("\nLos perros registrados son:\n" + misPerros);
		teclado.close();
	}

}
