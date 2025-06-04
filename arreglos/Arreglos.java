
package arreglos;
import java.util.Scanner;

public class Arreglos {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String [] nombreProductos = new String [3];
       int [] cantidades = new int [3];
       double [] preciosUnitarios = new double [3];
       double [] preciosTotales = new double [3];
       
       //Pedir datos
       for(int i=0; i<3; i++){
           System.out .println("Producto"+(i+1)+":");
           
           System.out.println("Nombre: ");
           nombreProductos[i] = scanner.nextLine();
           
           System.out.println("Cantidad: ");
           cantidades[i] = scanner.nextInt();
           scanner.nextLine();
           
           System.out.println("Precio unitario: ");
           preciosUnitarios[i] = scanner.nextDouble();
           scanner.nextLine();
           
           preciosTotales[i] = cantidades[i] + preciosUnitarios[i];
       }
       double totalFactura = 0;
       for( double precioTotal : preciosTotales){
           // += es porque va sumando de 1 en 1 
           totalFactura += precioTotal;
       }
       
       //Mostrar factura
       System.out.println("\n Factura");
       
       
       
       for(int i=0; i<3; i++){
           // printf porque quiero imrpimirle un arreglo
           // esos valores son los valores de carateres que quiero mostrar en el mensaje 
           System.out.printf("%-10s|%-8d|%13.2f|%11.4f \n",nombreProductos[i],cantidades[i],preciosUnitarios[i],preciosTotales[i]);  
       }
       System.out.println("---------------------------------");
       System.out.println("El total de la factura es: "+totalFactura);
    }
}
    
    

