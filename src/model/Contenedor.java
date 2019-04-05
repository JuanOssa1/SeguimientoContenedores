package model;
public class Contenedor
{
	private double largo;
	private double ancho;
	private double alto;
	
	Contenedor(double largo, double ancho, double alto)
	{
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}
	public double calcularVolumenDeUnContenedor()
	{
		double volumen = 0;
		volumen = largo*ancho*alto;
		return volumen;
	}
}