import java.util.Scanner;
public class AreaRectangulo {
    public static void main(String[] argss) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
        entrada.close();
    }
}
