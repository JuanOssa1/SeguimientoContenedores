package model;
public class Puerto
{
	private Contenedor contenedor1;
	private Contenedor contenedor2;
	private Contenedor contenedor3;
	
	public Puerto(double largo1, double ancho1, double alto1,double largo2, double ancho2, double alto2,double largo3, double ancho3, double alto3)
	{
		contenedor1 = new Contenedor(largo1, ancho1, alto1);
		contenedor2 = new contenedor(largo2, ancho2, alto2);
		contenedor3 = new contenedor(largo3, ancho3, alto3);
	}
	public double totalVolumen()
	{
		double volumenTotal = 0;
		volumenTotal = contenedor1.calcularVolumenDeUnContenedor() + contenedor2.calcularVolumenDeUnContenedor() + contenedor3.calcularVolumenDeUnContenedor();
		return volumenTotal;
	}
	public double promedioVolumen()
	{
		double volumenTotal = 0;
		double volumenEnPromedio = 0;
		volumenTotal = contenedor1.calcularVolumenDeUnContenedor() + contenedor2.calcularVolumenDeUnContenedor() + contenedor3.calcularVolumenDeUnContenedor();
		volumenEnPromedio = volumenTotal/3;
		return volumenEnPromedio;
	}
	
}