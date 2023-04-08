import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: R$");
        double s = sc.nextDouble();
        System.out.print("Digite quantas horas você trabalha por mês: ");
        double h = sc.nextDouble();
        double st = s * h;

        System.out.printf("O total do seu salário por mês é R$%.2f", st);

        sc.close();

    }

}
