package Dominio;

public class Clientes {
	private long numTarjeta;
	private String nombre;
	private String app;
	private String apm;
	private float saldo;

	public Clientes() {

	}

	public Clientes(long numTarjeta, String nombre, String app, String apm, float saldo) {
		this.numTarjeta = numTarjeta;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Clientes [numTarjeta=" + numTarjeta + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", saldo="
				+ saldo + "]\n";
	}

	public long getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarje(long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}