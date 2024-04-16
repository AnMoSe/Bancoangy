package LogicaApi;

import java.util.ArrayList;
import java.util.List;

import Dominio.Clientes;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	List<Clientes> lista = new ArrayList<Clientes>();
	Object numTarje = null;
	Clientes clienteEncontrado = null;

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		try {
			boolean bandera = false;
			for (Clientes cl : lista) {
				if (cl.getNumTarjeta() == cliente.getNumTarjeta()) {
					System.out.println("LOS DATOS PROPORCIONADOS YA EXISTEN.");
					bandera = true;
					break;
				}
			}
			if (bandera == false) {
				lista.add(cliente);
				System.out.println("LOS DATOS SE GUARDARON CON EXITO.");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR ERROR, INTENTE DE NUEVO." + e.getMessage());
		}

	}

	@Override
	public Clientes buscar(Long numTarjeta, Clientes cliente) {
	    boolean bandera = false;
	 
	    for (Clientes c : lista) {
	        if (c.getNumTarjeta() == numTarjeta) {
	            bandera = true;
	            clienteEncontrado = c;
	            System.out.println("HOLA BIENVENIDO SEAS AL CAJERO BANCOMER "+ c.getNombre()+"\n"+"Tarjeta "+c.getNumTarjeta()+"\n"+"TU SALDO ACTUAL ES: "+c.getSaldo());
				bandera=true;
	            break;
	        }
	    }

	    if (bandera == false) {
	        System.out.println("TARJETA NO ENCONTRADA.");
	    } else {
	        if (clienteEncontrado.getSaldo() > 0) {
	        	System.out.println("---------------------------------");
	            System.out.println("EL CLIENTE TIENE SALDO EXISTENTE.");
	            System.out.println("---------------------------------");
	        } else {
	            System.out.println("NO CUENTA CON SALDO EXISTENTE.");
	        }
	    }

	    return clienteEncontrado;
	}

	public void retiro(Float saldo, Clientes cliente) {
		    if (saldo > 0 && saldo <= cliente.getSaldo()) {
		        cliente.setSaldo(cliente.getSaldo() - saldo);
		        System.out.println("HA REALIZADO UN RETIRO DE $" + saldo + " CON ÉXITO.");
		        System.out.println("SALDO ACTUAL: $" + cliente.getSaldo());
		    } else {
		        System.out.println("ERROR: IMPORTE NO VÁLIDO O SALDO INSUFICIENTE.");
		    }
		}

	public void reaDeposito(Clientes cliente, float saldo) {
	    if (saldo > 0 && saldo <= 10000) {
	        cliente.setSaldo(cliente.getSaldo() + saldo);
	        System.out.println("USTED REALIZO UN DEPOSITO DE $" + saldo + " CON EXITO.");
	        System.out.println("SALDO ACTUAL: $" + cliente.getSaldo());
	    } else {
	        System.out.println("MONTO DE DEPÓSITO NO VÁLIDO.");
	    }
	
	}
}

