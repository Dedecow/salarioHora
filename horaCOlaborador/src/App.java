import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário mensal: ");
        double salarioMensal = sc.nextDouble();
        System.out.println(" Digite quantas horas você trabalhou esse mês: ");
        double hora = sc.nextDouble();
        double salarioHora = salarioMensal / hora;
        System.out.println(" Sua hora trabalhada é: R$" + salarioHora);
        sc.close();
    }
}
