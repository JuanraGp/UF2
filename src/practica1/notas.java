package practica1;
import java.util.Scanner;
/**
 * @author Juan Ramón García
 *
 * @version 2.0
 */


public class notas {

	double uf1, nota2, nota3;
	
	double acu1, acu2, acu3, def;
	
	/***
	 
	 * Instancia del constructor
	 
	 * */
	Scanner entrada = new Scanner(System.in);
	
	/**
 
	*Metodo para ingresar las notas por la cónsola
 
	 * */
	public void IngresaNotas() {
		
	
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();
		
		System.out.print("ingrese nota 2: ");
		nota2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		nota3= entrada.nextDouble();
		
		}
	
	/**
	 
	 * Filtro para ver que los datos ingresados son correctos
	 
	 */
	public void comprobarcion(){
		
		if (uf1>10) {
			
			System.out.println(" nota1 mal introducida");
			
		}else {
			
			System.out.println(" nota1 correcta");
			
		}
		if (nota2>10) {
			
			System.out.println(" nota2 mal introducida");
			
		}else {
			
			System.out.println(" nota2 correcta");
			
		}
		if (nota3>10) {
			
			System.out.println(" nota3 mal introducida");
			
		}else {
			
			System.out.println(" nota3 correcta");
			
		}
	}
	

	/**
	 
	 * Método para calcular la media aritmética
	 
	 */
	public void Calculonotas() {
		acu1= uf1*0.35;
		
		acu2 = nota2 * 0.35;
		
		acu3 = nota3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		

	}
	
	/**
	 
	 * Método para mostrar notas por pantalla
	 
	 */
	
	public void ExponerNotas() {

		System.out.println(" notas introducidas son:");
		
		System.out.println(" nota1 = " + uf1);
		
		System.out.println(" nota2 = " + nota2);
		
		System.out.println(" nota3 = " + nota3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		
		System.out.println(" acumuado 2 = "+ acu2);
		
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
	}
	
	/**
	  
	 * Metodo para comprobar si estas aprobado
	 
	 */
	
	public void aprobado() {
		if(def<5 && def>=0) {
			System.out.println("suspendio");
		}else {
			if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
			}else {
				System.out.println(" error en la notas");
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		
		fc.Calculonotas();
		
		fc.ExponerNotas();
		
		fc.aprobado();
		
	}

}
