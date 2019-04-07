package ui;
import model*;
import java.util.Scanner;
public class Main
{
	private Scanner dataRead;
	private Puerto puertofeliz;
	
	public Main()
	{
		init();	
	}
	
	
	public static void main(String args[])
	{
		Main m = new Main();
		m.menu();
	}
	public void init()
	{
	puertofeliz = new Puerto(0, 0, 0, 0, 0, 0, 0, 0, 0);
	dataRead = new Scanner(System.in);
	}
	public void menu()
	{
		System.out.println("¡BIENVENIDO!, PORFAVOR INGRESE LOS DATOS");
		System.out.println("Ingrese el largo del contenedor 1");
		String largo1 = dataRead.nextLine();
		System.out.println("Ingrese el ancho del contenedor 1");
		String ancho1 = dataRead.nextLine();
		System.out.println("Ingrese el alto del contenedor 1");
		String alto1 = dataRead.nextLine();
		System.out.println("Ingrese el largo del contenedor 2");
		String largo2 = dataRead.nextLine();
		System.out.println("Ingrese el ancho del contenedor 2");
		String ancho2 = dataRead.nextLine();
		System.out.println("Ingrese el alto del contenedor 2");
		String alto2 = dataRead.nextLine();
		System.out.println("Ingrese el largo del contenedor 3");
		String largo3 = dataRead.nextLine();
		System.out.println("Ingrese el ancho del contenedor 3");
		String ancho3 = dataRead.nextLine();
		System.out.println("Ingrese el alto del contenedor 3");
		String alto3 = dataRead.nextLine();
		int opcion = 0;
		mostarMenu(); 
		opcion = dataRead.nextInt();
		dataRead.nextLine();
		
		if(opcion == 1) 
		{
			puertofeliz = new Puerto(Integer.parseInt(largo1), Integer.parseInt(ancho1), Integer.parseInt(alto1),Integer.parseInt(largo2), Integer.parseInt(ancho2), Integer.parseInt(alto2), Integer.parseInt(largo3), Integer.parseInt(ancho3), Integer.parseInt(alto3));
			System.out.println("Volumen total: " + puertofeliz.totalVolumen());
			System.out.println("Tarea finalizada");
		}
		else if(opcion == 2) 
		{
			puertofeliz = new Puerto(Integer.parseInt(largo1), Integer.parseInt(ancho1), Integer.parseInt(alto1),Integer.parseInt(largo2), Integer.parseInt(ancho2), Integer.parseInt(alto2), Integer.parseInt(largo3), Integer.parseInt(ancho3), Integer.parseInt(alto3));
			System.out.println("Volumen promedio: " + puertofeliz.promedioVolumen());
			System.out.println("Tarea finalizada");
		}
		else if(opcion == 3)
		{
			puertofeliz = new Puerto(Integer.parseInt(largo1), Integer.parseInt(ancho1), Integer.parseInt(alto1),Integer.parseInt(largo2), Integer.parseInt(ancho2), Integer.parseInt(alto2), Integer.parseInt(largo3), Integer.parseInt(ancho3), Integer.parseInt(alto3));
			System.out.println("Volumen total: " + puertofeliz.totalVolumen()+ " " + "Volumen promedio: " + puertofeliz.promedioVolumen());
			System.out.println("Tarea finalizada");
		}
		else if(opcion != 1 || opcion != 2 || opcion != 3) 
		{
			System.out.println("Esta opcion no existe");
		}
		
		otraVez();
		
	}
	public void mostarMenu() 
	{
		System.out.println("1. Para mostar volumen total de la mercancia");
		System.out.println("2. Para mostar volumen promedio de los tres contenedores");
		System.out.println("3. Para mostar volumen total de la mercancia y volumen promedio de los tres contenedores al mismo tiempo");	
	}
	public void otraVez() 
	{
		System.out.println();
		System.out.println("ESCOJA OTRA OPCION PARA SEGUIR PROBRANDO EL PROGRAMA");
		System.out.println();
		menu();
	}
}