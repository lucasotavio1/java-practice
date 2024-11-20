import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double comissao = totalVendas * 0.15;
        double total = salarioFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f\n", total);
        scanner.close();
    }
}
