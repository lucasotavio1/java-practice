import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int anos = n/365;
        n %= 365;
        int meses = n/30;
        n %= 30;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(n + " dia(s)");
        scanner.close();
    }
}