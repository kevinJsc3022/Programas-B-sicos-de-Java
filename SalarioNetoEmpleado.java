import java.util.Scanner;
public class SalarioNetoEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu salario bruto mensual: ");
        double SalarioBruto = entrada.nextDouble();
        System.out.print("Ingresa el porcentaje de impuestos: ");
        double PorcentajeImpuestos = entrada.nextDouble();
        System.out.print("Ingresa las deducciones adicionales ");
        double Deducciones = entrada.nextDouble();
        double Impuestos = SalarioBruto * (PorcentajeImpuestos/100);
        double SalarioNeto = SalarioBruto-Impuestos-Deducciones;
        System.out.println("Tu salario neto es: " + SalarioNeto);
        entrada.close();
    }
}
