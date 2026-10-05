import java.util.Scanner;
public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer múmero: ");
        double num3 = entrada.nextDouble();
        double promedio = (num1 + num2 + num3)/3;
        System.out.println("El promedio es: " + promedio);
        entrada.close();
    }
}
