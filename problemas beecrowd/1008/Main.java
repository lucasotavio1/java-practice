import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int qtdHoras = scanner.nextInt();
        double valorHora = scanner.nextDouble();
        double salario = qtdHoras * valorHora;
        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        scanner.close();
    }
}
