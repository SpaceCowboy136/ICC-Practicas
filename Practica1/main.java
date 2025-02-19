import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double num1, num2;
        int opcion;

        Scanner entrada= new Scanner(System.in);

        System.out.println("===== CALCULADORA :D =====");
        System.out.println("Seleccione una operación ingresando el número de la opción");
        System.out.println(" 1. Suma ");
        System.out.println(" 2. Multiplicación");
        System.out.println(" 3. División ");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
            System.out.println("Seleccionaste la opción Suma \n Ingresa 2 números");
            num1= entrada.nextDouble();
            num2 = entrada.nextDouble();
            double suma = num1+num2;
            System.out.println("La suma es: "+num1 + " + "+num2+ " = " +suma );
            break;

            case 2:
            System.out.println("Seleccionaste la opción Multiplicación \nIngresa 2 números: ");
            num1= entrada.nextDouble();
            num2 = entrada.nextDouble();
            double multi = num1 *num2;
            System.out.println("La multiplicación es: "  +num1 + " * "+num2+ " = " + multi);
            break;

            case 3:
            System.out.println("Seleccionaste la opcion División \n Ingresa 2 números");
            num1= entrada.nextDouble();
            num2 = entrada.nextDouble();
            double div = num1/num2;
            System.out.println("La división es: "+num1 + " / "+num2+ " = "  + div);
            break;

            default:
            System.out.println("Opción no valida :( ");
            break;

        }




    }
    
}
