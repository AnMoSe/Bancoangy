package Principal;

import java.util.Scanner;

import Dominio.Clientes;
import LogicaApi.LogicaMetodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Clientes
		long numTarjeta;
		String nombre;
		String app;
		String apm;

		float saldo = 0;

		Clientes cliente = null;

		Scanner sc = null;

		int menuPrin;

		LogicaMetodos impCliente = new LogicaMetodos();

		try {
			do {
				System.out.println("***MENU BANCOMER BIENVENIDO***");
				System.out.println("1.- ALTA TARJETAS");
				System.out.println("2.- CONSULTAR SALDO");
				System.out.println("3.- DEPOSITO EN EFECTIVO");
				System.out.println("4.- RETIRO EN EFECTIVO");
				System.out.println("5.- SALIR");
				sc = new Scanner(System.in);
				menuPrin = sc.nextInt();

				switch (menuPrin) {
				case 1:
					try {
						System.out.println("INGRESE EL NUMERO DE TARJETA: ");
						sc = new Scanner(System.in);
						numTarjeta = sc.nextLong();

						System.out.println("DIGITE EL NOMBRE DEL CLIENTE: ");
						sc = new Scanner(System.in);
						nombre = sc.nextLine();

						System.out.println("DIGITE EL APELLIDO PATERNO: ");
						sc = new Scanner(System.in);
						app = sc.nextLine();

						System.out.println("DIGITE EL APELLIDO MATERNO: ");
						sc = new Scanner(System.in);
						apm = sc.nextLine();

						cliente = new Clientes(numTarjeta, nombre, app, apm, saldo);

						impCliente.guardar(cliente);

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("ERROR, ERROR...." + e.getMessage());
						break;
					}

					break;

				case 2:
					try {
						System.out.println("DIJITA EL NUMERO DE TARJETA: ");
						sc = new Scanner(System.in);
						numTarjeta = sc.nextLong();
						impCliente.buscar(numTarjeta, cliente);

						break;

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("ERROR ERRORRRRRR, INTENTA DE NUEVO." + e.getMessage());
					}
					break;

				case 3:
					try {
						System.out.println("***DEPOSITAR EFECTIVO***");
						System.out.println("INGRESE EL NUMERO DE TARJETA: ");
						sc = new Scanner(System.in);
						numTarjeta = sc.nextLong();
						impCliente.buscar(numTarjeta, cliente);

						System.out.println("CUANTO DESEA DEPOSITAR?");
						sc = new Scanner(System.in);
						float montoDeposito = sc.nextFloat();
						impCliente.reaDeposito(cliente, montoDeposito);
						break;

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("ERROR ERROR, INTENTE DE NUEVO." + e.getMessage());

					}
					break;

				case 4:
					try {
						System.out.println("***RETIRAR EFECTIVO***");
						System.out.println("INGRESE EL NUMERO DE TARJETA: ");
						sc = new Scanner(System.in);
						numTarjeta = sc.nextLong();
						impCliente.buscar(numTarjeta, cliente);

						System.out.println("INGRESE LA CANTIDAD A RETIRAR: ");
						sc = new Scanner(System.in);
						numTarjeta = sc.nextLong();
						impCliente.retiro(saldo, cliente);

						break;
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("ERROR ERROR, INTENTE DE NUEVO." + e.getMessage());
					}
					

				}

			} while (menuPrin < 5);

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("ERROR ERROR, INTENTE DE NUEVO." + e.getMessage());
		}
	}
}
