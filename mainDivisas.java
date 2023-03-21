
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 -COP a USD \n"
            + "2 -COP a EURO \n"
            + "3 -COP a YEN JP \n"
            + "4 -COP a GBP \n"
            + "5 -COP a WONES \n"
            + "6 -USD a COP \n"
            + "7 -EURO a COP \n"
            + "8 -YEN JP a COP\n"
            + "9 -GBP a COP\n"
            + "0 -WONES a COP\n"
            + "_ ---SALIR---");
            System.out.print("Ingrese una opcion:");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    convertir(0.00021, "COP");
                    break;
                case '2':
                    convertir(5012.68, "COP");
                    break;
                case '3':
                    convertir(34.65, "COP");
                    break;
                case '4':
                    convertir(5621.67, "COP");
                    break; 
                case '5':
                    convertir(0.28, "COP");
                    break;    
                case '6':
                    convertir(0.00021, "USD");
                    break;
                case '7':
                    convertir(0.00020, "EURO");
                    break; 
                case '8':
                    convertir(0.029, "JPY");
                    break;
                case '9':
                    convertir(0.00018, "GBP");
                    break;    
                case '0':
                    convertir(0.28, "WONES");
                    break;     
                case '_':
                    System.out.println("CERRANDO PROGRAMA");
                    break;    
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        }
    }
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s:", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double) Math.round(dolares * 100d)/100;
        
        System.out.println("-----------");
        System.out.println("Tienes $" + dolares + "de intercambio");
        System.out.println("-----------");
    }
}
