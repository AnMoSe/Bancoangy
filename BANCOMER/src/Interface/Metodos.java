package Interface;

import Dominio.Clientes;

public interface Metodos {
	
	public void guardar(Clientes cliente);
	
	public  Clientes buscar(Long numTarjeta, Clientes cliente);
	
	public void retiro(Float saldo, Clientes cliente);

}
