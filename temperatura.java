
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) {
	  char opcion;
	  double x;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Introduzca temperatura:");
      x = sc.nextInt();
      
          System.out.println("CONVERSOR DE temperatura");
          System.out.println("1 - F a C \n"
        	        + "2 - C a F \n"
        	        + "3 - C a K \n"
        	        + "4 - K a C \n"
        	        + "5 - K a F \n"
        	        + "6 - F a K \n"
        	        + "7 ---SALIR---");
          System.out.print("Ingrese una opcion:");
          Scanner leer = new Scanner(System.in);
          opcion = leer.next().charAt(0);
          
          switch(opcion){
              case '1': System.out.println((x -32) * 5/9);
                  break;
              case '2': System.out.println(9/5.0 * x + 32);
                  break;
              case '3': System.out.println(x + 273.15);
                  break;
              case '4': System.out.println(x -273.15);
                  break; 
              case '5': System.out.println((x -273.15) * 9/5 + 32);
                  break;    
              case '6': System.out.println((x -32) * 5/9 + 273.15);
                  break;
              case '7':
                  System.out.println("CERRANDO PROGRAMA");
                  break;    
              default:
                  System.out.println("OPCION INCORRECTA");
                  break;
          }
 }
    
}
