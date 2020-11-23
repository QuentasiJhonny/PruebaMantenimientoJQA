package Lab1;



import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		double r,area,circunferecnia;
		
                Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		r=leer.nextDouble();
		
               
                
		circunferecnia =2 * Math.PI*r;
		area= Math.PI*Math.pow(r, 2);
		System.out.println("Circulo con radio "+r+",");
		System.out.println(" la circunferencia es "+circunferecnia);
		System.out.println(" y el area es "+area+".");
		 leer.close();
                }
               
	}

